package com.maxcom.mpm.paypal.model;
// Generated 18-sep-2014 9:04:00 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MpmCnotificaciones generated by hbm2java
 */
public class MpmCnotificaciones  implements java.io.Serializable {


     private long idNotificacion;
     private MpmCtiposNotificaciones mpmCtiposNotificaciones;
     private String subject;
     private String body;
     private String creadoPor;
     private Date fechaCreacion;
     private String sistema;
     private String modificadoPor;
     private Date fechaModificacion;
     private boolean activo;
     private Set<MpmCestados> mpmCestadoses = new HashSet<MpmCestados>(0);

    public MpmCnotificaciones() {
    }

	
    public MpmCnotificaciones(long idNotificacion, MpmCtiposNotificaciones mpmCtiposNotificaciones, String subject, String body, String creadoPor, Date fechaCreacion, String sistema, boolean activo) {
        this.idNotificacion = idNotificacion;
        this.mpmCtiposNotificaciones = mpmCtiposNotificaciones;
        this.subject = subject;
        this.body = body;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.sistema = sistema;
        this.activo = activo;
    }
    public MpmCnotificaciones(long idNotificacion, MpmCtiposNotificaciones mpmCtiposNotificaciones, String subject, String body, String creadoPor, Date fechaCreacion, String sistema, String modificadoPor, Date fechaModificacion, boolean activo, Set<MpmCestados> mpmCestadoses) {
       this.idNotificacion = idNotificacion;
       this.mpmCtiposNotificaciones = mpmCtiposNotificaciones;
       this.subject = subject;
       this.body = body;
       this.creadoPor = creadoPor;
       this.fechaCreacion = fechaCreacion;
       this.sistema = sistema;
       this.modificadoPor = modificadoPor;
       this.fechaModificacion = fechaModificacion;
       this.activo = activo;
       this.mpmCestadoses = mpmCestadoses;
    }
   
    public long getIdNotificacion() {
        return this.idNotificacion;
    }
    
    public void setIdNotificacion(long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }
    public MpmCtiposNotificaciones getMpmCtiposNotificaciones() {
        return this.mpmCtiposNotificaciones;
    }
    
    public void setMpmCtiposNotificaciones(MpmCtiposNotificaciones mpmCtiposNotificaciones) {
        this.mpmCtiposNotificaciones = mpmCtiposNotificaciones;
    }
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    public String getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getSistema() {
        return this.sistema;
    }
    
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    public String getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Set<MpmCestados> getMpmCestadoses() {
        return this.mpmCestadoses;
    }
    
    public void setMpmCestadoses(Set<MpmCestados> mpmCestadoses) {
        this.mpmCestadoses = mpmCestadoses;
    }




}

