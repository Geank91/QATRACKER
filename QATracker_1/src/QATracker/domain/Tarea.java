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
public class Tarea {
    
    private int idTarea;
    private String descripcionTarea;
    private int idUsuario;
    private int estadoTarea;
    private int idProyecto;

    public Tarea() {
    }

    public Tarea(String descripcionTarea, int idUsuario, int estadoTarea, int idProyecto) {
        this.descripcionTarea = descripcionTarea;
        this.idUsuario = idUsuario;
        this.estadoTarea = estadoTarea;
        this.idProyecto = idProyecto;
    }
    
    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }
    
    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(int estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    
}
