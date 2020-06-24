package Org.EduardoAgustin.Clases;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagenes {
    
        public void Imagenes(JLabel imagen, String nombre){
        ImageIcon img = new ImageIcon(nombre);
        Icon img2 = new ImageIcon(img.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
        imagen.setIcon(img2);
        imagen.repaint();
    }
}
