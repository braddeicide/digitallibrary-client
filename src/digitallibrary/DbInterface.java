/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitallibrary;

import java.sql.Connection;

/**
 *
 * @author brad
 */
public interface DbInterface {
        
    public Connection connect(configData config);
  
}
