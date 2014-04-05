/*
 * popupExceptionDialog.java
 *
 * Created on March 14, 2005, 12:49 AM
 */

package digitallibrary;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JButton;
/**
 *
 * @author brad
 */
public class popupExceptionDialog extends JDialog {
   private javax.swing.JPanel Buttonpanel;
    private javax.swing.JPanel border;
    private javax.swing.JPanel eastpad;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel northpad;
    private javax.swing.JPanel southpad;
    private javax.swing.JPanel westpad;
    
         public popupExceptionDialog(String msg) {
            super();
    
        border = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        northpad = new javax.swing.JPanel();
        southpad = new javax.swing.JPanel();
        eastpad = new javax.swing.JPanel();
        westpad = new javax.swing.JPanel();
        Buttonpanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        

        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        border.setLayout(new java.awt.BorderLayout());

        border.setBorder(new javax.swing.border.EtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setNextFocusableComponent(jButton1);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setBorder(new javax.swing.border.TitledBorder("Error"));
        jTextArea1.setText(msg);
        jPanel1.add(jTextArea1, java.awt.BorderLayout.CENTER);
        jPanel1.add(northpad, java.awt.BorderLayout.NORTH);
        jPanel1.add(southpad, java.awt.BorderLayout.SOUTH);
        jPanel1.add(eastpad, java.awt.BorderLayout.EAST);
        westpad.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(westpad, java.awt.BorderLayout.WEST);
        border.add(jPanel1, java.awt.BorderLayout.CENTER);
        Buttonpanel.setLayout(new java.awt.GridLayout(1, 3));
        jButton1.setText("Ok");
jButton1.grabFocus();
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        
        jPanel5.add(jButton1);
        Buttonpanel.add(jPanel5);
        border.add(Buttonpanel, java.awt.BorderLayout.SOUTH);
jButton1.grabFocus();
        getContentPane().add(border, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-450)/2, (screenSize.height-296)/2, 450, 296);
jButton1.grabFocus();
         }
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
            this.dispose();
        }       

        private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {
jButton1.grabFocus();
            this.dispose();
        }

}


            
           /* 
            jButton1 = new javax.swing.JButton();
            Buttonpanel = new javax.swing.JPanel();
            jPanel5 = new javax.swing.JPanel();
           
            jTextArea1 = new javax.swing.JTextArea();
            jScrollPane1 = new javax.swing.JScrollPane();
            jScrollPane1.setAutoscrolls(true);
            setBounds(100, 100, 500, 375);
            jTextArea1.setOpaque(true);
            jTextArea1.setLineWrap(true);
            jTextArea1.setEditable(false);
            jTextArea1.setText(msg);
            jTextArea1.setAlignmentX(javax.swing.SwingConstants.CENTER);
            jTextArea1.setNextFocusableComponent(jButton1);
            jScrollPane1.setViewportView(jTextArea1);

            getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
            
            jButton1.setText("OK");
            jButton1.setPreferredSize(new java.awt.Dimension(80, 25));
            Buttonpanel.setLayout(new java.awt.GridLayout(1, 3));
            jPanel5.add(jButton1);
            Buttonpanel.add(jPanel5);
            
            
            jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        getContentPane().add(Buttonpanel, java.awt.BorderLayout.SOUTH);
         }

        private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
            this.dispose();
    }
}

*/