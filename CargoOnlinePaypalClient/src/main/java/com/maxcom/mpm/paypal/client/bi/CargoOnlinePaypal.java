package com.maxcom.mpm.paypal.client.bi;

import com.maxcom.mpm.paypal.client.dto.RespuestaConfirmalPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionConfirmaPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionPagoExpressTO;

public interface CargoOnlinePaypal {
    public RespuestaSolPagoExpressTO solicitarPagoExpress(TransaccionPagoExpressTO trasaccion)throws Exception;
    public RespuestaDetallePagoExpressTO recuperaDetallePagoExpress(TransaccionDetallePagoExpressTO trasaccion)throws Exception;
    public RespuestaConfirmalPagoExpressTO confirmarPagoExpress(TransaccionConfirmaPagoExpressTO trasaccion)throws Exception;
}
