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
public class DbMySQL implements DbInterface {
    
    public Connection connect(configData config) {
            Connection conn;
            String Database = "digitallibrary";
            String Server   = config.getServer();
            String Username = config.getLocalDbUsername();
            String Password = config.getLocalDbPassword();

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://" + Server + "/" + Database,Username,Password);
            } catch (java.lang.Exception e) {
                throw new popupException(e);
            }
        return conn;
    }
}
