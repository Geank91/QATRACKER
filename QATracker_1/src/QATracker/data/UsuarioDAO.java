/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.data;

import QATracker.connections.MYSQLDB;
import QATracker.domain.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geank
 */
public class UsuarioDAO {
    
    private MYSQLDB mySQLDB;
    
    public UsuarioDAO(){
    
    }
    
    // Tarea hacer el delete y el update
    
    public void delete(Usuario usuario)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "delete from usuario where id = '"+usuario.getIdUsuario()+"' and name='"+usuario.getDescripcionUsuario()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void update(Usuario usuario)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update usuario set name = '"+usuario.getDescripcionUsuario()+"' where id='"+usuario.getIdUsuario()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void add(Usuario usuario) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into usuario (id,name)" + "values (" +usuario.getIdUsuario()+", '"+usuario.getDescripcionUsuario()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public ResultSet select(Usuario usuario)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM usuario WHERE idusuario = "+usuario.getIdUsuario()+"";
        ResultSet res = mySQLDB.executeQuery(sql);        
        mySQLDB.closeExecuteQuery();
        return res;
        
    }
    
    public boolean exists(Usuario usuario)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from usuario where name='"+usuario.getDescripcionUsuario()+"'";
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
