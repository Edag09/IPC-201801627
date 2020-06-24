package Org.EduardoAgustin.Clases;

import Org.EduardoAgustin.Ventanas.Galaga;
import Org.EduardoAgustin.Ventanas.Menu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tiempo extends Thread {
    int seg = 0;
    int min = 0;
    JLabel tiempo;
    public Tiempo(JLabel tie) {
        this.tiempo = tie;
    }
    
    
    @Override
    public void run() {
        try {
        for (min = 4; min >=0; min --) {
            for (seg=60;seg > 0; seg--) {
                tiempo.setText("Minutos: "+min+" Segundos: "+seg);
                Thread.sleep(1100);
                }
            }
            JOptionPane.showMessageDialog(null, "Se Acabo el timepo");
            System.exit(0);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
