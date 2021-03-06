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
    private Usuario usuarioActual;
    
    public UsuarioDAO(){
        this.usuarioActual=null;
    }

    public Usuario getUsuarioActual() throws SQLException {
        if(this.usuarioActual!=null){
            mySQLDB= new MYSQLDB();
            String sql= "Select * from usuario where NombreUsuario='"+this.usuarioActual.getDescripcionUsuario()+"'";
            ResultSet res= mySQLDB.executeQuery(sql);
            while(res.next()){
                this.usuarioActual.setIdUsuario(res.getInt(1));
                this.usuarioActual.setEstadoUsuario(res.getInt(4));
                this.usuarioActual.setClave(res.getString(3));
                this.usuarioActual.setPuesto(res.getString(5));
            }
            mySQLDB.closeExecuteQuery();
        }
        return this.usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    public void add(Usuario usuario) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into usuario (NombreUsuario, Clave, EstadoUsuario, Puesto)" + "values ('" +usuario.getDescripcionUsuario()+"'"
                + ", '"+usuario.getClave()+"', "+usuario.getEstadoUsuario()+", '"+usuario.getPuesto()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void update(Usuario usuario) throws SQLException{
        mySQLDB= new MYSQLDB();
        String sql= "update usuario set NombreUsuario='"+usuario.getDescripcionUsuario()+"', Puesto='"+usuario.getPuesto()+"' where NombreUsuario='"+this.usuarioActual.getDescripcionUsuario()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void changePass(Usuario usuario) throws SQLException{
        mySQLDB= new MYSQLDB();
        String sql="update usuario set Clave='"+usuario.getClave()+"' where NombreUsuario='"+this.usuarioActual.getDescripcionUsuario()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public boolean match(Usuario usuario) throws SQLException{
        mySQLDB= new MYSQLDB();
        boolean match= false;
        String sql= "select Clave from usuario where NombreUsuario= '"+usuario.getDescripcionUsuario()+"'";
        ResultSet res= mySQLDB.executeQuery(sql);
        while(res.next()){
            if (res.getString(1).matches(usuario.getClave())) {
                match= true;
            }
        }
        mySQLDB.closeExecuteQuery();
        return match;
    }
    
    public void login(Usuario usuario){
        this.usuarioActual= usuario;
    }
    
    public void logOut(){
        this.usuarioActual=null;
    }
    
    public boolean exists(Usuario usuario)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from usuario where NombreUsuario='"+usuario.getDescripcionUsuario()+"'";
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            usuario.setPuesto(res.getString(5));
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
