/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitallibrary;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author brad
 */
public class Dbsqlite implements DbInterface {
    
    public Connection connect(configData config) {
            Connection conn;
            
            try {
                Class.forName("org.sqlite.JDBC").newInstance();
                conn = DriverManager.getConnection("jdbc:sqlite:digitallibrary.db");
            } catch (java.lang.Exception e) {
                throw new popupException(e);
            }
        return conn;
    }
}
