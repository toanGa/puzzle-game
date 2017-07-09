/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

/**
 *
 * @author toan
 */
public final class SizedImage extends JComponent {
    BufferedImage IMAGE;
    String Bigname;
    BufferedImage img1,img2,img3,img4,img5,img6,
                  img7,img8,img9,img10,img11,img12;
    
    public void choose(){
    JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            String name = chooser.getSelectedFile().getPath();
            System.out.println(name);
            Bigname = name;
            //
            //ImageIcon icon1 = new ImageIcon(name);
            // chua chay icon1  = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
            //setPicture(label,name);
        } else {
        }
    }
    
    //Split split = new Split(Bigname,3,4);
    public  SizedImage(){
        choose();// da co Bigname;
        try{
           BufferedImage image = ImageIO.read(new File(Bigname));
           //int x = label.getSize().width;
           //int y = label.getSize().height;
           int ix = image.getWidth();
           int iy = image.getHeight();
           int bigx;
           int bigy;
           //int smallSize;
           if(ix > iy){
               //ReSizedImage re = new ReSizedImage();
               //IMAGE = (BufferedImage) re.getScaled(image,200,200);
               IMAGE = (BufferedImage) image.getScaledInstance(960, 720, Image.SCALE_AREA_AVERAGING);
               ImageIO.write(IMAGE, "jpg", new File("IMAGE.jpg")); 
               bigx = ix;
               bigy = (int) 3*bigx/4;
               System.out.println("dx,dy = " + bigx +":" + bigy);
               //smallSize = bigx/4;
               Split split = new Split(Bigname,3,4);
           } else{
                IMAGE = (BufferedImage) image.getScaledInstance(720, 960, Image.SCALE_AREA_AVERAGING);
                ImageIO.write(IMAGE, "jpg", new File("IMAGE.jpg")); 
                bigx = IMAGE.getWidth();
                bigy = (int) 4*bigx/3;
                System.out.println("dx,dy = " + bigx +":" + bigy);
                //smallSize = bigx/3;
                Split split = new Split(Bigname,4,3);
           }
           //ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
           //label.setIcon(icon);
        }catch(IOException ex){
           // Logger.getLogger(ImageDemo.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println("no image");
        }
    }
}
