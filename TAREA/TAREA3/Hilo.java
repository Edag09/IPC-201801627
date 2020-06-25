package HT3;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Hilo extends Thread{
    private JButton boton1;
    private JButton boton2;
    private Color color;
    private JPanel lienzo;
    private int cont;
    

    public Hilo(JButton btn1, JButton btn2,JPanel panel, int cont) {
        this.boton1 = btn1;
        this.boton2 = btn2;
        this.lienzo=panel;
        this.cont = cont;
    }
    
    @Override
    public void run(){
        while (true) {            
            try {
                Thread.sleep(8000);
                
                        if (getBoton1().getBackground() == RED) {
                            getBoton1().setBackground(Color.BLUE);
                        }else if (getBoton1().getBackground() == BLUE) {
                            getBoton1().setBackground(Color.RED);
                        }
                     
                        if (getBoton2().getBackground() == BLUE) {
                            getBoton2().setBackground(Color.RED);
                        }else if (getBoton2().getBackground() == RED) {
                            getBoton2().setBackground(Color.BLUE);
                        
            } 
            }catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }

    /**
     * @return the boton1
     */
    public JButton getBoton1() {
        return boton1;
    }

    /**
     * @param boton1 the boton1 to set
     */
    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }

    /**
     * @return the boton2
     */
    public JButton getBoton2() {
        return boton2;
    }

    /**
     * @param boton2 the boton2 to set
     */
    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the lienzo
     */
    public JPanel getLienzo() {
        return lienzo;
    }

    /**
     * @param lienzo the lienzo to set
     */
    public void setLienzo(JPanel lienzo) {
        this.lienzo = lienzo;
    }

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }
}
