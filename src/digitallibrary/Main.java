/*
 * Main.java
 *
 * Created on May 18, 2005, 8:46 PM
 */

package digitallibrary;

/**
 *
 * @author brad
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new Interface();
        } catch(popupException e){}
    }
    
}
