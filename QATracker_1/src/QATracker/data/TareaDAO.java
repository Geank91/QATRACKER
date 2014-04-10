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
    
    // Tarea hacer el delete y el update
    
    public void delete(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "delete from tarea where id = '"+tarea.getIdTarea()+"' and name='"+tarea.getDescripcionTarea()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void update(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update tarea set name = '"+tarea.getDescripcionTarea()+"' where id='"+tarea.getIdTarea()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void add(Tarea tarea) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into tarea (id,name)" + "values (" +tarea.getIdTarea()+", '"+tarea.getDescripcionTarea()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public ResultSet select(Tarea tarea)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM tarea WHERE idtarea = "+tarea.getIdTarea()+"";
        ResultSet res = mySQLDB.executeQuery(sql);        
        mySQLDB.closeExecuteQuery();
        return res;
        
    }
    
    public boolean exists(Tarea tarea)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from tarea where name='"+tarea.getDescripcionTarea()+"'";
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
