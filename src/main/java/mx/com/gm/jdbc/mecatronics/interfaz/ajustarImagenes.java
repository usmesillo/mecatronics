/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.jdbc.mecatronics.interfaz;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jaime
 */
public class ajustarImagenes {
    
    
    public static void ajustarImagen(JLabel labelName, String root){
    
    ImageIcon image=new ImageIcon(root);
    Icon icon=new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight(),Image.SCALE_DEFAULT));
    labelName.setIcon(icon);
    
    }
       public static void ajustarImagenPanel(JLabel labelName, String root){
    
    ImageIcon image=new ImageIcon(root);
    Icon icon=new ImageIcon(image.getImage().getScaledInstance(labelName.getPreferredSize().width,labelName.getPreferredSize().height,Image.SCALE_SMOOTH));
    labelName.setIcon(icon);
    
    }
    
}
