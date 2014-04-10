/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.UsuarioDAO;
import QATracker.domain.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Geank
 */
public class UsuarioBusiness {
    
    public UsuarioBusiness() {
    }
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    public UsuarioBusiness(UsuarioDAO UsuarioDAO){
        this.usuarioDAO = UsuarioDAO;
    }
    public void crear(Usuario usuario) throws SQLException{
        if (usuarioDAO.exists(usuario)) {
            usuarioDAO.add(usuario);
        } else {
            throw new SQLException("No se puede crear un nuevo usuario ya que este usuario ya existe");
        }
    }
    public void actualizar(Usuario usuario) throws SQLException{
        if (usuarioDAO.exists(usuario)== true) {
            usuarioDAO.update(usuario);
        } else {
            throw new SQLException("No se puede actualizar el usuario por que no se encuentra en la base de datos");
        }
    }
    public void imprimir(Usuario usuario) throws SQLException{
        if (usuarioDAO.exists(usuario)) {
            usuarioDAO.select(usuario);
        } else {
            throw new SQLException("No se puede imprimir el usuario por que este no existe en la base de datos");
        }
    }
    
}
