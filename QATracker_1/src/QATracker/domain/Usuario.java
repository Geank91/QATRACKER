/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.domain;

import java.util.ArrayList;

/**
 *
 * @author Geank
 */
public class Usuario {
    
    private int idUsuario;
    private String descripcionUsuario;
    private String clave;
    private int estadoUsuario;
    private String puesto;

    public Usuario() {
    }

    public Usuario(String descripcionUsuario, String clave, int estadoUsuario, String puesto) {
        this.descripcionUsuario = descripcionUsuario;
        this.clave = clave;
        this.estadoUsuario = estadoUsuario;
        this.puesto = puesto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
