/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.data;

import QATracker.connections.MYSQLDB;
import QATracker.domain.Proyecto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geank
 */
public class ProyectoDAO {
    
    private MYSQLDB mySQLDB;
    
    public ProyectoDAO(){  
    }
    
    // Tarea hacer el delete y el update
    
    public void delete(Proyecto proyecto)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "delete from proyecto where idproyecto = "+proyecto.getIdProyecto();
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void update(Proyecto proyecto)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update proyecto set descripcionproy = '"+proyecto.getDescripcionProyecto()+"', estadoproy="+proyecto.getEstadoProyecto()+""
                + ", fechainicio='"+proyecto.getFechainicio()+"', fechafinal='"+proyecto.getFechafinal()+"' where idproyecto="+proyecto.getIdProyecto();
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void add(Proyecto proyecto) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into proyecto (descripcionproy, estadoproy, fechainicio, fechafinal)" + "values ('"+proyecto.getDescripcionProyecto()+"', "+proyecto.getEstadoProyecto()+", "
                + "'"+proyecto.getFechainicio()+"','"+proyecto.getFechafinal()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public ResultSet consultaId(Proyecto proyecto)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM proyecto WHERE idproyecto = "+proyecto.getIdProyecto()+"";
        ResultSet res = mySQLDB.executeQuery(sql);
        return res;    
    }
    
    public ResultSet consultaGeneral() throws SQLException{
        mySQLDB= new MYSQLDB();
        String sql= "Select * from proyecto";
        ResultSet res= mySQLDB.executeQuery(sql);
        return res;
    }
    
    public boolean exists(Proyecto proyecto)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from proyecto where idproyecto="+proyecto.getIdProyecto();
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
