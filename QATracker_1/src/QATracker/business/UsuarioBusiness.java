/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.UsuarioDAO;
import QATracker.domain.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Geank
 */
public class UsuarioBusiness {
    
    private UsuarioDAO usuarioDAO;
    
    public UsuarioBusiness() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public Usuario getUsuarioActual() throws SQLException {
        return usuarioDAO.getUsuarioActual();
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        usuarioDAO.setUsuarioActual(usuarioActual);
    }
    
    public void crear(Usuario usuario) throws SQLException{
        if (usuarioDAO.exists(usuario)==false) {
            usuarioDAO.add(usuario);
        } else {
            throw new SQLException("No se puede crear un nuevo usuario ya que este usuario ya existe");
        }
    }

    public void save(Usuario usuario) throws SQLException{
        usuarioDAO.update(usuario);
    }
    
    public void changePassword(Usuario usuario, String clave) throws SQLException{
        if (usuarioDAO.getUsuarioActual().getClave().matches(clave)) {
            usuarioDAO.changePass(usuario);
        }else{
            throw new SQLException("La clave es incorrecta.");
        }
    }
    
   public void login(Usuario usuario) throws SQLException{
       if (usuarioDAO.getUsuarioActual()==null) {
           if (usuarioDAO.exists(usuario)==true) {
                if (usuarioDAO.match(usuario)==true) {
                    usuarioDAO.login(usuario);
                }else{
                    throw new SQLException("La clave del usuario es incorrecta.");
                }
            }else{
                throw new SQLException("No se puede ingresar el usuario no existe.");
            }
       }else{
           throw new SQLException("Ya se encuentra una sesion abierta.");
       }   
    }//
   
   public void signOut() throws Exception{
       if (usuarioDAO.getUsuarioActual()!=null) {
           usuarioDAO.logOut();
       }else{
           throw new Exception("No hay ninguna sesion abierta.");
       }
   }
   
}
