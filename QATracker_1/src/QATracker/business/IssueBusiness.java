/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.IssueDAO;
import QATracker.domain.Issue;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Geank
 */
public class IssueBusiness {
    
    private IssueDAO issueDAO;
    
    public IssueBusiness() {
        this.issueDAO = new IssueDAO();
    }
     
    public void crear(Issue issue) throws SQLException{
        if (issueDAO.exists(issue)==false) {
            issueDAO.add(issue);
        } else {
            throw new SQLException("No se puede crear un nuevo issue ya que este issue ya existe");
        }
    }
    public void actualizar(Issue issue) throws SQLException{
        if (issueDAO.exists(issue)== true) {
            issueDAO.update(issue);
        } else {
            throw new SQLException("No se puede actualizar el issue por que no se encuentra en la base de datos");
        }
    }
    
    public ResultSet consultaTarea(Issue issue) throws SQLException{
        return issueDAO.consultaTarea(issue);
    }
    
    public ResultSet consultaId(Issue issue) throws SQLException{
        if (issueDAO.exists(issue)) {
            return issueDAO.consultaId(issue);
        } else {
            throw new SQLException("No se puede imprimir el issue por que este no existe en la base de datos");
        }
    }
    
}
