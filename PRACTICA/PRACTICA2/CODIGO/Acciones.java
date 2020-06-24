package Org.EduardoAgustin.Clases;

import javax.swing.JLabel;

public class Acciones extends Thread{
    private JLabel nave,asteroide,bala,rayo,caracol,ojo,corazon;
    private JLabel fondo;
    private Imagenes incertar = new Imagenes();
    public static int puntos=0,vidas=3,poder;
    PintarImagen asteroides;
    ColocarNave bal;

    
                @Override
                public void run(){
                    while (true) {                        
                        try {
                            
                            if (bal.getBala().getX() == asteroides.getImagen().getX() && bal.getBala().getY() == asteroides.getImagen().getY()) {
                                fondo.remove(asteroides.getImagen());
                                asteroides.getImagen().setLocation(0, 0);
                                bal.getBala().setVisible(false);
                                fondo.repaint();
                                puntos++;
                                 System.out.println("Le diste al asteroide"+puntos);
                            }
                        } catch (Exception e) {
                        }
                    }
    
                }

                
                
                
                
                
                
                
    /**
     * @return the nave
     */
    public JLabel getNave() {
        return nave;
    }

    /**
     * @param nave the nave to set
     */
    public void setNave(JLabel nave) {
        this.nave = nave;
    }

    /**
     * @return the asteroide
     */
    public JLabel getAsteroide() {
        return asteroide;
    }

    /**
     * @param asteroide the asteroide to set
     */
    public void setAsteroide(JLabel asteroide) {
        this.asteroide = asteroide;
    }

    /**
     * @return the bala
     */
    public JLabel getBala() {
        return bala;
    }

    /**
     * @param bala the bala to set
     */
    public void setBala(JLabel bala) {
        this.bala = bala;
    }

    /**
     * @return the fondo
     */
    public JLabel getFondo() {
        return fondo;
    }

    /**
     * @param fondo the fondo to set
     */
    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    /**
     * @return the rayo
     */
    public JLabel getRayo() {
        return rayo;
    }

    /**
     * @param rayo the rayo to set
     */
    public void setRayo(JLabel rayo) {
        this.rayo = rayo;
    }

    /**
     * @return the caracol
     */
    public JLabel getCaracol() {
        return caracol;
    }

    /**
     * @param caracol the caracol to set
     */
    public void setCaracol(JLabel caracol) {
        this.caracol = caracol;
    }

    /**
     * @return the ojo
     */
    public JLabel getOjo() {
        return ojo;
    }

    /**
     * @param ojo the ojo to set
     */
    public void setOjo(JLabel ojo) {
        this.ojo = ojo;
    }

    /**
     * @return the corazon
     */
    public JLabel getCorazon() {
        return corazon;
    }

    /**
     * @param corazon the corazon to set
     */
    public void setCorazon(JLabel corazon) {
        this.corazon = corazon;
    }

    /**
     * @return the incertar
     */
    public Imagenes getIncertar() {
        return incertar;
    }

    /**
     * @param incertar the incertar to set
     */
    public void setIncertar(Imagenes incertar) {
        this.incertar = incertar;
    }
}
