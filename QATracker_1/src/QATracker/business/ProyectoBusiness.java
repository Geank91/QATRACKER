/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.ProyectoDAO;
import QATracker.domain.Proyecto;
import java.sql.SQLException;

/**
 *
 * @author Geank
 */
public class ProyectoBusiness {
    
    public ProyectoBusiness() {
    }
    
    ProyectoDAO proyectoDAO = new ProyectoDAO();
    public ProyectoBusiness(ProyectoDAO ProyectoDAO){
        this.proyectoDAO = ProyectoDAO;
    }
    public void crear(Proyecto proyecto) throws SQLException{
        if (proyectoDAO.exists(proyecto)) {
            proyectoDAO.add(proyecto);
        } else {
            throw new SQLException("No se puede crear un nuevo proyecto ya que este proyecto ya existe");
        }
    }
    public void actualizar(Proyecto proyecto) throws SQLException{
        if (proyectoDAO.exists(proyecto)== true) {
            proyectoDAO.update(proyecto);
        } else {
            throw new SQLException("No se puede actualizar el proyecto por que no se encuentra en la base de datos");
        }
    }
    public void imprimir(Proyecto proyecto) throws SQLException{
        if (proyectoDAO.exists(proyecto)) {
            proyectoDAO.select(proyecto);
        } else {
            throw new SQLException("No se puede imprimir el proyecto por que este no existe en la base de datos");
        }
    }
    
    
}
