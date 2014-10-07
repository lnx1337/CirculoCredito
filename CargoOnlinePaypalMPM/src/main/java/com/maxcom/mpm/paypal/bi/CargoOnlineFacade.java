package com.maxcom.mpm.paypal.bi;

import com.maxcom.mpm.paypal.bi.service.AutenticacionService;
import com.maxcom.mpm.paypal.bi.service.BitacoraService;
import com.maxcom.mpm.paypal.bi.service.CargoOnlineService;
import com.maxcom.mpm.paypal.bi.service.impl.AutenticacionServiceImpl;
import com.maxcom.mpm.paypal.bi.service.impl.BitacoraServiceImpl;
import com.maxcom.mpm.paypal.bi.service.impl.CargoOnlineServiceImpl;
import com.maxcom.mpm.paypal.dto.AutenticacionTO;
import com.maxcom.mpm.paypal.dto.CargoTO;
import com.maxcom.mpm.paypal.dto.DetalleErrorTO;
import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.RespuestaTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionTO;
import static com.maxcom.mpm.paypal.util.Utilerias.isValidList;
import static com.maxcom.mpm.paypal.util.Utilerias.isValidString;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * La clase CargoOnlineFacade implementa las operaciones para trabajar 
 * con los cargos online de Paypal en el MPM.
 * 
 * @author Nelson Castelar
 * @version 1.0
 */
public class CargoOnlineFacade implements ICargoOnline {
    
    private BitacoraService bitacoraService;
    private CargoOnlineService cargoOnlineService;
    private AutenticacionService autenticacionService;
    
    private List<DetalleErrorTO> listDetalleError;
    private RespuestaSolicitudTO respuesta;
        
    static final Logger logger = LogManager.getLogger(CargoOnlineFacade.class);
    
    /**
     * Constructor default de la clase
     */
    public CargoOnlineFacade(){
        //Agregar DI
        this.bitacoraService = new BitacoraServiceImpl();
        this.cargoOnlineService = new CargoOnlineServiceImpl();
        this.autenticacionService = new AutenticacionServiceImpl();
        this.listDetalleError = new ArrayList<>();
    }
    
    
    /**
     * Solicita el pago de la transaccion especificada
     * @param transaccion Transaccion a procesar
     * @return Regresa la respuesta que resulto del procesamiento. Un objeto de tipo RespuestaTO.
     * @since 1.0
     */
    @Override
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion) {
        //StringBuilder observaciones =;
        try {
            logger.info("CargoOnlineFacade:solicitarPago(E)");
            
            if (!this.isTransaccionValida(transaccion)) {                
                this.respuesta = new RespuestaSolicitudTO("-", "-", null, "-", 
                                                          "-", null, 0, "-", 
                                                          "ETRAN", "Error - Transaccion nula", 
                                                          Calendar.getInstance().getTime());
                return respuesta;
            }
            
            //Validando datos minimos requeridos
            if (!this.isTransaccionCompleta(transaccion)) {
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }
            
            /*
            //PENDIENTE 
            if(isTransaccionExistente(transaccion)){
                return this.respuesta;
            }
            */
            
            //Persistir la solicitud de entrada
            //PENDIENTE this.guardarBitacoraSolicitud(transaccion);
            
            //Validando credenciales de la solicitud
            if (!this.isAutenticacionValida(transaccion.getAutenticacion())) {                
                this.respuesta = new RespuestaSolicitudTO("-", "-", null, "-", 
                                                          "-", null, transaccion.getIdOrden(), transaccion.getIdTransaccion(), 
                                                          "ETRAN", "Error - Credenciales invalidas", 
                                                          Calendar.getInstance().getTime());
                
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
                return respuesta;
            }            
            
            //Revisando los datos cargo por cargo
            //this.revisarDetalleCargo(transaccion.getCargo());
            
            this.respuesta = this.cargoOnlineService.solicitarPago(transaccion);            
            //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
            
            return this.respuesta;            
        } catch (Exception e) {
            logger.error("Error en CargoOnlineFacade:solicitarPago - " + e.toString());            
            e.printStackTrace();            
            StringBuilder detalleErrorApp = new StringBuilder("");            
            detalleErrorApp.append("Error en el aplicativo - Servicio de CargoOnline Paypal - solicitarPago.");
            //Agregar notificaciones de mail en caso de error
            this.respuesta = new RespuestaSolicitudTO("-", "-", null, "-", 
                                                      "-", null, transaccion.getIdOrden(), transaccion.getIdTransaccion(), 
                                                      "EAPP", detalleErrorApp.toString(), 
                                                      Calendar.getInstance().getTime());
            
            try{
                //PENDIENTE this.guardarBitacoraRespuesta(this.respuesta);
            }catch(Exception err){
                logger.error("Error al intentar guardar el error- " + err.getMessage());
            }
            
            return this.respuesta;
        } finally {
            logger.info("CargoOnlineFacade:solicitarPago(S)");
        }
    }
    
    /**
     * Valida que las credenciales de autenticacion sean validas.
     * @param autenticacion Credenciales a validar.
     * @return True - Si la autentucación es satisfactoria.
     * @throws Exception Si algun error inesperado ocurre
     */
    private boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception {
        try {
            logger.info("   CargoOnlineFacade:isAutenticacionValida(E)");            
            
            if(autenticacionService.isAutenticacionValida(autenticacion)){
                return true;
            }            
            
        } catch (Exception e) {
            logger.error(" Error en CargoOnlineFacade:isAutenticacionValida - "+ e.getMessage());
            throw e;
        } finally {
            logger.info("   CargoOnlineFacade:isAutenticacionValida(S)");
        }
        return false;
    }
    
    /**
     * Valida si la transaccion es valida. Una transaccion es valida si no es nula.
     * @param transaccion Transaccion a validar
     * @return True - Si la transaccion es valida.
     */
    private boolean isTransaccionValida(TransaccionTO transaccion){
        return transaccion != null;
    }
    
    /**
     * Valida si la transaccion tiene la informacion minima requerida para su procesamiento.
     * @param transaccion Transaccion a procesar.
     * @return True - Si la transaccion cuenta con la informacion minima para su procesamiento.
     */
    private boolean isTransaccionCompleta(TransaccionSolicitudTO transaccion) {
        StringBuilder error = new StringBuilder();
        
        if (!isValidString(transaccion.getIdTransaccion())) {
            error.append("El campo idTransaccion es obligatorio - ");
        }
        
        if (!isValidString(transaccion.getReferencia())) {
            error.append("El campo referencia es obligatorio.");
        }        
        
        if (transaccion.getAutenticacion() == null) {
            error.append("El campo autenticacion es obligatorio - ");
        }else{
            if (!isValidString(transaccion.getAutenticacion().getClaveServicio())) {
                error.append("El campo claveServicio es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getUsuario())) {
                error.append("El campo usuario es obligatorio - ");
            }
            if (!isValidString(transaccion.getAutenticacion().getContrasenia())) {
                error.append("El campo contrasenia es obligatorio - ");
            }
        }               
        
        if (!isValidList(transaccion.getCargos())) {
            error.append("El campo cargos es obligatorio (enviar al menos un cargo) -");
        }else{
            boolean bErrorCargo=false;
            for(CargoTO cargoAux: transaccion.getCargos()){
                
                if(cargoAux.getCantidad() < 1){
                    bErrorCargo=true;
                    error.append("El campo cantidad debe ser mayor a 0 (Revisar Cargos) - ");
                }
                
                if(!isValidString(cargoAux.getDescripcion())){
                    bErrorCargo=true;
                    error.append("El campo descripcion es obligatorio (Revisar Cargos) - ");
                }
                
                if(cargoAux.getPrecio() <= 0.0){
                    bErrorCargo=true;
                    error.append("El campo precio debe ser mayor a 0.0 (Revisar Cargos) - ");
                }
                
                //Reportando solo el primer error encontrado en un cargo
                if(bErrorCargo){
                    break;
                }
                
            }
        }
        
        if (!isValidString(transaccion.getReturnUrl())) {
            error.append("El campo returnUrl es obligatorio - ");
        }
        
        if (!isValidString(transaccion.getCancelUrl())) {
            error.append("El campo cancelUrl es obligatorio - ");
        }                
                
        if (error.length() > 0) {
            this.respuesta = new RespuestaSolicitudTO("-", "-", null, "-", 
                                                      "-", null, transaccion.getIdOrden(), transaccion.getIdTransaccion(), 
                                                      "ETRAN", "Error - Transaccion incompleta ->"+error.toString(), 
                                                      Calendar.getInstance().getTime());
            return false;
        }
        
        return true;
    } 
    
    
    private void guardarBitacoraSolicitud(TransaccionTO transaccion) throws Exception{        
        bitacoraService.guardarSolicitud(transaccion);
        
    }
    
    private void guardarBitacoraRespuesta(RespuestaTO respuesta) throws Exception{
        bitacoraService.guardarRespuesta(respuesta);
    }
    
    private boolean isTransaccionExistente(TransaccionTO transaccion) throws Exception{
        //this.respuesta = new RespuestaTO();
        long idSolicitud = bitacoraService.buscarTransaccion(transaccion,respuesta);
        
        return idSolicitud>0;        
    }

    @Override
    public RespuestaDetallePagoTO recuperarDetallePago(TransaccionDetallePagoTO transaccion) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public RespuestaConfirmacionPagoTO confirmarPago(TransaccionConfirmacionPagoTO transaccion) {
        throw new UnsupportedOperationException("Not supported."); //To change body of generated methods, choose Tools | Templates.
    }
    
}