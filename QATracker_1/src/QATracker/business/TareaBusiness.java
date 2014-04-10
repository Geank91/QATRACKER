/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.TareaDAO;
import QATracker.domain.Tarea;
import java.sql.SQLException;

/**
 *
 * @author Geank
 */
public class TareaBusiness {
    
    public TareaBusiness() {
    }
    
    TareaDAO tareaDAO = new TareaDAO();
    public TareaBusiness(TareaDAO TareaDAO){
        this.tareaDAO = TareaDAO;
    }
    public void crear(Tarea tarea) throws SQLException{
        if (tareaDAO.exists(tarea)) {
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
    public void imprimir(Tarea tarea) throws SQLException{
        if (tareaDAO.exists(tarea)) {
            tareaDAO.select(tarea);
        } else {
            throw new SQLException("No se puede imprimir la tarea por que este no existe en la base de datos");
        }
    }
    
}
