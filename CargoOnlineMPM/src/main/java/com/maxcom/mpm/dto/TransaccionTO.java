package com.maxcom.mpm.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaccion")
public class TransaccionTO {
    
    @XmlElement(required=true)
    private String idOrigen;
    @XmlElement(required=true)
    private CargoTO cargo;
    @XmlElement(required=true)
    private AutenticacionTO autenticacion;
   
    @XmlTransient
    private long idOrden;    
    
    /**
     * @return the autenticacion
     */
    public AutenticacionTO getAutenticacion() {
        return autenticacion;
    }

    /**
     * @param autenticacion the autenticacion to set
     */
    public void setAutenticacion(AutenticacionTO autenticacion) {
        this.autenticacion = autenticacion;
    }    

    /**
     * @return the idOrden
     */
    public long getIdOrden() {
        return idOrden;
    }

    /**
     * @param idOrden the idOrden to set
     */
    public void setIdOrden(long idOrden) {
        this.idOrden = idOrden;
    }

    /**
     * @return the cargo
     */
    public CargoTO getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(CargoTO cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the idOrigen
     */
    public String getIdOrigen() {
        return idOrigen;
    }

    /**
     * @param idOrigen the idOrigen to set
     */
    public void setIdOrigen(String idOrigen) {
        this.idOrigen = idOrigen;
    }
    
}
