/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOTests;

import QATracker.connections.MYSQLDB;
import QATracker.domain.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Michelle
 */
public class UsuarioDAOTest {
    
    private MYSQLDB mySQLDB;
    
    public UsuarioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void add() throws SQLException{
        Usuario usuario= new Usuario("Usuario", "User", 1, "Usuario");
        mySQLDB = new MYSQLDB();
        String sql = "insert into usuario (NombreUsuario, Clave, EstadoUsuario, Puesto)" + "values ('" +usuario.getDescripcionUsuario()+"'"
                + ", '"+usuario.getClave()+"', "+usuario.getEstadoUsuario()+", '"+usuario.getPuesto()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    @Test
    @Ignore
    public void select()throws SQLException{
        Usuario usuario= new Usuario();
        usuario.setIdUsuario(1);
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM usuario WHERE idusuario = "+usuario.getIdUsuario()+"";
        ResultSet res = mySQLDB.executeQuery(sql);
        while(res.next()){
            System.out.println("Nombre: "+res.getString(2)+"/ Puesto:"+res.getString(5));
        }
        mySQLDB.closeExecuteQuery();
    }
    
    @Test
    @Ignore
    public void login() throws SQLException{
        Usuario usuario= new Usuario();
        usuario.setIdUsuario(1);
        usuario.setClave("admin");
        mySQLDB= new MYSQLDB();
        boolean match= false;
        String sql= "select Clave from usuario where idUsuario="+usuario.getIdUsuario();
        ResultSet res= mySQLDB.executeQuery(sql);
        while(res.next()){
            System.out.println(res.getString(1));
            if (res.getString(1).matches(usuario.getClave())) {
                match= true;
            }
        }
        mySQLDB.closeExecuteQuery();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
