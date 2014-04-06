/*
 * sql.java
 *
 * Created on March 13, 2005, 1:51 PM
 */

package digitallibrary;
import static digitallibrary.Interface.localSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 *
 * @author brad
 */
public class sql {

    private Connection con;
    private DSLContext jooqDSLContext;
    
    public sql(){
    }
    
    public sql(String username, String password, String Server, String database) throws Exception{
//    try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://" + Server + "/" + database,username,password);
//        } catch(com.mysql.jdbc.CommunicationsException e) {
//            throw new popupException("Connection Error, please check connection.");
//        } catch(Exception e){
//            throw new popupException(e);
//        }        
//       this.jooqDSLContext = DSL.using(localSql.getCon(), SQLDialect.MYSQL);
         this.jooqDSLContext = DSL.using(localSql.getCon());

    }     

    public Connection getCon() {
        return(con);
    }

    public DSLContext getJooq() {
        return this.jooqDSLContext;
    }
    
    public String[] query(String sqlQuery, String[] retrieve) throws popupException{
        String[] answers = new String[retrieve.length];
        answers[0] = new String("");
        int i = 0;
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery);
            
        while(rs.next()) {
                answers[i] = rs.getString(retrieve[i]);
                i++;
        }
           
        } catch(SQLException e){
            throw new popupException(e); 
        }
        return(answers);
    }

    public boolean insert(String sqlQuery) throws popupException{
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sqlQuery);        
        } catch(com.mysql.jdbc.MysqlDataTruncation M){
            /*IMPORTANT! Ignore mysql's impropper use of Exceptions! */
        } catch(SQLException e){
            throw new popupException(e); 
        }
      return true;
    }
    
    public ArrayList query2d(String sqlQuery, String[] retrieve) throws popupException{
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] array1 = new String[retrieve.length];
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery);
  
            for (int i=0; rs.next(); i++) {
                array1 = new String[retrieve.length];
                for(int j=0; j<retrieve.length; j++){
                    array1[j] = rs.getString(retrieve[j]);
                }
             arrayList1.add(array1);
            }           
        } catch(SQLException e){
            throw new popupException(e); 
        } 
        return(arrayList1);
    }
}
