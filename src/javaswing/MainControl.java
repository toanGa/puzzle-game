/*
 * this gama was designed by Toan Ga
 * game maked for my like
 */
package javaswing;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author toan
 */
public class MainControl {
    //static int mainx,mainy;
    
    //static testFrame f = new testFrame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Thread b= new Thread(new addComponent());
        
             //f.show();
        addComponent mainControl = new addComponent();
        
        //a.disable();
        mainControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //a.setVisible(true);
        mainControl.setSize(650, 550);
        
        Timer t = new Timer(1000,mainControl);
        t.start();
        mainControl.setResizable(false);
        mainControl.show();
                    
    }

    
}
