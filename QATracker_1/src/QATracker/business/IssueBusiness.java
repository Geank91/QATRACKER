/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.business;

import QATracker.data.IssueDAO;
import QATracker.domain.Issue;
import java.sql.SQLException;

/**
 *
 * @author Geank
 */
public class IssueBusiness {
    
    public IssueBusiness() {
    }
    
    IssueDAO issueDAO = new IssueDAO();
    public IssueBusiness(IssueDAO IssueDAO){
        this.issueDAO = IssueDAO;
    }
    public void crear(Issue issue) throws SQLException{
        if (issueDAO.exists(issue)) {
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
    public void imprimir(Issue issue) throws SQLException{
        if (issueDAO.exists(issue)) {
            issueDAO.select(issue);
        } else {
            throw new SQLException("No se puede imprimir el issue por que este no existe en la base de datos");
        }
    }
    
}
