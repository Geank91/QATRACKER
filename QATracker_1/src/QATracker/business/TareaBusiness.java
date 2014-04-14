/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.ProyectoDAO;
import QATracker.data.TareaDAO;
import QATracker.domain.Tarea;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Geank
 */
public class TareaBusiness {
    
    private TareaDAO tareaDAO;
    
    public TareaBusiness() {
        this.tareaDAO= new TareaDAO();
    }
   
    public void crear(Tarea tarea) throws SQLException{
        if (tareaDAO.exists(tarea)==false) {
            tareaDAO.add(tarea);
        } else {
            throw new SQLException("No se puede crear una nueva tarea ya que esta tarea ya existe");
        }
    }
    public void actualizar(Tarea tarea) throws SQLException{
        if (tareaDAO.exists(tarea)== true) {
            tareaDAO.update(tarea);
        } else {
            throw new SQLException("No se puede actualizar la tarea por que no se encuentra en la base de datos");
        }
    }
    
    public void renombrar(Tarea tarea) throws SQLException{
        if (tareaDAO.exists(tarea)==true) {
            tareaDAO.rename(tarea);
        }else{
            throw new SQLException("No se puede actualizar la tarea por que no se encuentra en la base de datos");
        }
    }
    
    public ResultSet consultaProyecto(Tarea tarea) throws SQLException{
        return tareaDAO.consultaProyecto(tarea);
    }
    
    public ResultSet consultaId(Tarea tarea) throws SQLException{
        if (tareaDAO.exists(tarea)==true) {
            return tareaDAO.consultaCodigo(tarea);
        } else {
            throw new SQLException("No se puede imprimir la tarea por que este no existe en la base de datos");
        }
    }
}
