/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QATracker.data;

import QATracker.connections.MYSQLDB;
import QATracker.domain.Issue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Geank
 */
public class IssueDAO {
    
    private MYSQLDB mySQLDB;
    
    public IssueDAO(){
    
    }
    
    public void update(Issue issue)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update issue set descripcionissue= '"+issue.getDescripcionIssue()+"', idtarea="+issue.getIdTarea()+", estadoissue="
                +issue.getEstadoIssue()+" where idissue='"+issue.getIdIssue()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void add(Issue issue) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into issue (descripcionissue, idtarea, estadoissue) values ('"+issue.getDescripcionIssue()+"',"
                + issue.getIdTarea()+", "+issue.getEstadoIssue()+")";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public ResultSet consultaTarea(Issue issue)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM issue WHERE idtarea= "+issue.getIdTarea();
        ResultSet res = mySQLDB.executeQuery(sql);        
        return res;
    }
    
    public ResultSet consultaId(Issue issue) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM issue WHERE idissue= "+issue.getIdIssue();
        ResultSet res = mySQLDB.executeQuery(sql);        
        return res;
    }
    
    public boolean exists(Issue issue)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from issue where idissue="+issue.getIdIssue();
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
