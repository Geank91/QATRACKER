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
public class Issue {
    
    private int idIssue;
    private String descripcionIssue;
    private int idTarea;
    private int estadoIssue;

    public Issue() {
    }

    public Issue(String descripcionIssue, int idTarea, int estadoIssue){
        this.descripcionIssue = descripcionIssue;
        this.idTarea = idTarea;
        this.estadoIssue = estadoIssue;
    }

    public int getIdIssue() {
        return idIssue;
    }

    public void setIdIssue(int idIssue) {
        this.idIssue = idIssue;
    }

    public String getDescripcionIssue() {
        return descripcionIssue;
    }

    public void setDescripcionIssue(String descripcionIssue) {
        this.descripcionIssue = descripcionIssue;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public int getEstadoIssue() {
        return estadoIssue;
    }

    public void setEstadoIssue(int estadoIssue) {
        this.estadoIssue = estadoIssue;
    }

}
