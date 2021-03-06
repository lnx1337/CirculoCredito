package com.maxcom.mpm.paypal.model;
// Generated 09-oct-2014 10:04:04 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * MpmTbitacoraConfPagoPaypal generated by hbm2java
 */
public class MpmTbitacoraConfPagoPaypal  implements java.io.Serializable {


     private long idBitacoraConfPagoPaypal;
     private MpmTbitacoraConfPaypal mpmTbitacoraConfPaypal;
     private String transactionId;
     private String paymentStatus;
     private String transactionType;
     private String paymentType;
     private String paymentDate;
     private BigDecimal grossAmount;
     private BigDecimal feeAmount;
     private String creadoPor;
     private String modificadoPor;
     private Date fechaCreacion;
     private Date fechaModificacion;

    public MpmTbitacoraConfPagoPaypal() {
    }

	
    public MpmTbitacoraConfPagoPaypal(long idBitacoraConfPagoPaypal, MpmTbitacoraConfPaypal mpmTbitacoraConfPaypal, String creadoPor, Date fechaCreacion) {
        this.idBitacoraConfPagoPaypal = idBitacoraConfPagoPaypal;
        this.mpmTbitacoraConfPaypal = mpmTbitacoraConfPaypal;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
    }
    public MpmTbitacoraConfPagoPaypal(long idBitacoraConfPagoPaypal, MpmTbitacoraConfPaypal mpmTbitacoraConfPaypal, String transactionId, String paymentStatus, String transactionType, String paymentType, String paymentDate, BigDecimal grossAmount, BigDecimal feeAmount, String creadoPor, String modificadoPor, Date fechaCreacion, Date fechaModificacion) {
       this.idBitacoraConfPagoPaypal = idBitacoraConfPagoPaypal;
       this.mpmTbitacoraConfPaypal = mpmTbitacoraConfPaypal;
       this.transactionId = transactionId;
       this.paymentStatus = paymentStatus;
       this.transactionType = transactionType;
       this.paymentType = paymentType;
       this.paymentDate = paymentDate;
       this.grossAmount = grossAmount;
       this.feeAmount = feeAmount;
       this.creadoPor = creadoPor;
       this.modificadoPor = modificadoPor;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
    }
   
    public long getIdBitacoraConfPagoPaypal() {
        return this.idBitacoraConfPagoPaypal;
    }
    
    public void setIdBitacoraConfPagoPaypal(long idBitacoraConfPagoPaypal) {
        this.idBitacoraConfPagoPaypal = idBitacoraConfPagoPaypal;
    }
    public MpmTbitacoraConfPaypal getMpmTbitacoraConfPaypal() {
        return this.mpmTbitacoraConfPaypal;
    }
    
    public void setMpmTbitacoraConfPaypal(MpmTbitacoraConfPaypal mpmTbitacoraConfPaypal) {
        this.mpmTbitacoraConfPaypal = mpmTbitacoraConfPaypal;
    }
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getPaymentStatus() {
        return this.paymentStatus;
    }
    
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getTransactionType() {
        return this.transactionType;
    }
    
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public BigDecimal getGrossAmount() {
        return this.grossAmount;
    }
    
    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }
    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }
    
    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }
    public String getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }
    public String getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }




}


