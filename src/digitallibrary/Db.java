/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitallibrary;
import java.sql.Connection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

/**
 *
 * @author brad
 */
public class Db {
//    private static String dbTypeSelected  = null;
    private static Connection dbconn = null;
    private DSLContext jooqDSLContext;
    
    public Db(configData config) {
        //Connection conn = null;
        String db = config.getServerType();
        try {
                Class localcls = Class.forName("digitallibrary."+db);
                DbInterface theDB = (DbInterface)localcls.newInstance();
                this.dbconn = theDB.connect(config);
         } catch (Exception e) {
             throw new popupException(e);
         };
         this.jooqDSLContext = DSL.using(this.dbconn);
    }

    public DSLContext getjooq(){
        return this.jooqDSLContext;
    }
    
}