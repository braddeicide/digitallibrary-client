/*
 * ImagePanel.java
 *
 * Created on May 18, 2005, 9:37 PM
 */

package digitallibrary;

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class ImagePanel extends JPanel implements Serializable {
    Image image = null;
   
    public ImagePanel() {   
    }

    public ImagePanel(Image image) {
        this.image = image;
    }

    public void setImage(Image image){
        this.image = image;
    }
   
    public Image getImage(Image image){
        return image;
    }
   
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //paint background
        if (image != null) { //there is a picture: draw it
            int height = this.getSize().height;
            int width = this.getSize().width;         
            g.drawImage(image,0,0, width, height, this);
            //g.drawImage(image, 0, 0, this); //original image size
         }  //end if
    } //end paint
} //end class
