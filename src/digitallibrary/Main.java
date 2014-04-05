/*
 * Main.java
 *
 * Created on May 18, 2005, 8:46 PM
 */

package digitallibrary;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.io.*;

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
//        Interface one = new Interface();
        new Interface();
    } catch(popupException e){}
//        String test = one.go();
        // TODO code application logic here
    }
    
}
