package QATracker.domain;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Michelle
 */
public class Proyecto {
    
    private int idProyecto;
    private String descripcionProyecto;
    private int estadoProyecto;
    private Date fechainicio;
    private Date fechafinal;

    public Proyecto() {
    }

    public Proyecto(String descripcionProyecto, int estadoProyecto, Date fechainicio, Date fechafinal) {
        this.descripcionProyecto = descripcionProyecto;
        this.estadoProyecto = estadoProyecto;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
    }
    
    public int getIdProyecto() {
        return idProyecto;
    }

    public void setId(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public int getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(int estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

}
