package Video;
import javax.swing.*;

public class Hilo extends Thread{
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JPanel panel;
    
    public Hilo(JButton btn1, JPanel panel,JButton btn2,JButton btn3,JButton btn4){
    this.boton1 = btn1;
    this.panel = panel;
    this.boton2 = btn2;
    this.boton3 = btn3;
    this.boton4 = btn4;
    }
    
    
    
    @Override
    public void run(){
        while (true) {            
            try {
                Thread.sleep(450);
                if (getBoton1().getY() < 225) {
                   getBoton1().setLocation(getBoton1().getX(), getBoton1().getY()+10);
                }
                if (getBoton2().getY() < 150) {
                    getBoton2().setLocation(getBoton2().getX(), getBoton2().getY()+10);
                }
                if (getBoton3().getY() < 75 ) {
                    getBoton3().setLocation(getBoton3().getX(), getBoton3().getY()+10);
                }
                if (getBoton4().getY() < 0) {
                    getBoton4().setLocation(getBoton4().getX(), getBoton4().getY()+10);
                }
                
                
                
            } catch (Exception e) {
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
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
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
     * @return the boton3
     */
    public JButton getBoton3() {
        return boton3;
    }

    /**
     * @param boton3 the boton3 to set
     */
    public void setBoton3(JButton boton3) {
        this.boton3 = boton3;
    }

    /**
     * @return the boton4
     */
    public JButton getBoton4() {
        return boton4;
    }

    /**
     * @param boton4 the boton4 to set
     */
    public void setBoton4(JButton boton4) {
        this.boton4 = boton4;
    }

}
