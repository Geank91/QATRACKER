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
    
    // Tarea hacer el delete y el update
    
    public void delete(Issue issue)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "delete from issue where id = '"+issue.getIdIssue()+"' and name='"+issue.getDescripcionIssue()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void update(Issue issue)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "update issue set name = '"+issue.getDescripcionIssue()+"' where id='"+issue.getIdIssue()+"'";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public void add(Issue issue) throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql = "insert into issue (id,name)" + "values (" +issue.getIdIssue()+", '"+issue.getDescripcionIssue()+"')";
        mySQLDB.execute(sql);
        mySQLDB.closeExecute();
    }
    
    public ResultSet select(Issue issue)throws SQLException{
        mySQLDB = new MYSQLDB();
        String sql =  "SELECT * FROM issue WHERE idissue = "+issue.getIdIssue()+"";
        ResultSet res = mySQLDB.executeQuery(sql);        
        mySQLDB.closeExecuteQuery();
        return res;
        
    }
    
    public boolean exists(Issue issue)throws SQLException{
        boolean exist = false;
        mySQLDB = new MYSQLDB();
        String sql = "select * from issue where name='"+issue.getDescripcionIssue()+"'";
        ResultSet res = mySQLDB.executeQuery(sql);
        if (res.next()){
            exist=true;
        }
        mySQLDB.closeExecuteQuery();
        return exist;
    }
    
}
