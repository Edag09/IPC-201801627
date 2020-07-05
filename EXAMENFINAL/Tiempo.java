
package Video;

import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tiempo extends Thread {
    int seg = 0;
    JLabel tiempo;
    public Tiempo(JLabel tie) {
        this.tiempo = tie;
    }
    
    
    @Override
    public void run() {
        try {
        
            for (seg=20;seg >= 0; seg--) {
                tiempo.setText("Segundos: "+seg);
                tiempo.setFont(new Font("Cavolini", Font.PLAIN, 24));
                Thread.sleep(850);
                }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}