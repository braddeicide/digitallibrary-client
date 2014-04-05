/*
 * popupException.java
 *
 * Created on March 13, 2005, 2:04 PM
 */

package digitallibrary;

/**
 *
 * @author brad
 */

public class popupException extends RuntimeException {
    
    /** Creates a new instance of VisualiserException */
    public popupException(Exception msg) {
        popupExceptionDialog two = new popupExceptionDialog(msg.toString());
        two.show();
        }

     public popupException(String msg) {
        popupExceptionDialog two = new popupExceptionDialog(msg);
        two.show();
    }
}