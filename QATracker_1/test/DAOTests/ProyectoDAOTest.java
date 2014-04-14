/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOTests;

import QATracker.connections.MYSQLDB;
import QATracker.domain.Proyecto;
import java.sql.Date;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michelle
 */
public class ProyectoDAOTest {
    
    private MYSQLDB mySQLDB;
    
    public ProyectoDAOTest() {
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
        Date inicio= new Date(2013, 1, 1);
        Proyecto proyecto= new Proyecto("Prueba", 2, inicio, inicio);
        mySQLDB = new MYSQLDB();
        String sql = "insert into proyecto (descripcionproy, estadoproy, fechainicio, fechafinal)" + "values ('"+proyecto.getDescripcionProyecto()+"', "+proyecto.getEstadoProyecto()+", "
                + "'"+proyecto.getFechainicio()+"','"+proyecto.getFechafinal()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
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
