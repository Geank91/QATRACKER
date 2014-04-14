/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.data;

import QATracker.connections.MYSQLDB;
import QATracker.domain.Tarea;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geank
 */
public class TareaDAO {
    
    private MYSQLDB mySQLDB;
    
    public TareaDAO(){
    
    }
    
    public void rename(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update tarea set descripciontarea='"+tarea.getDescripcionTarea()+"' where idtarea= "+tarea.getIdTarea();
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void update(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update tarea set descripciontarea = '"+tarea.getDescripcionTarea()+"', idusuario="+tarea.getIdUsuario()+","
                + "estadotarea="+tarea.getEstadoTarea()+", idproyecto="+tarea.getIdProyecto()+" where idtarea="+tarea.getIdTarea();
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void add(Tarea tarea) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into tarea (descripciontarea, idusuario, estadotarea, idproyecto) values ('"+tarea.getDescripcionTarea()+"',"
                + tarea.getIdUsuario()+","+tarea.getEstadoTarea()+","+tarea.getIdProyecto()+")";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public ResultSet consultaProyecto(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM tarea WHERE idproyecto = "+tarea.getIdProyecto();
        ResultSet res = mySQLDB.executeQuery(sql);
        return res;
    }
    
    public ResultSet consultaCodigo(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM tarea WHERE idtarea = "+tarea.getIdTarea();
        ResultSet res = mySQLDB.executeQuery(sql);
        return res;
    }
    
    public boolean exists(Tarea tarea)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from tarea where idtarea="+tarea.getIdTarea();
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
