package Org.EduardoAgustin.Clases;

import javax.swing.JLabel;

public class ColocarNave extends Thread {

    private JLabel nave, bala;
    JLabel lienzo;
    private int mover;
    Imagenes incertar = new Imagenes();

    public ColocarNave(JLabel nave, JLabel bala, JLabel lienzo, int movimiento) {
        this.nave = nave;
        this.lienzo = lienzo;
        this.mover = movimiento;
        this.bala = bala;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                switch (mover) {
                    case 1:
                        if (getNave().getX() < 300) {
                            getNave().setLocation(getNave().getX() + 100, getNave().getY());
                            setMover(0);
                        }
                        break;
                    case 2:
                        if (getNave().getX() >= 100) {
                            getNave().setLocation(getNave().getX() - 100, getNave().getY());
                            setMover(0);
                        }
                        break;
                    case 3:
                        bala = new JLabel();
                        bala.setSize(25, 25);
                        incertar.Imagenes(bala, "C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Galaga\\src\\Imagenes Galaga\\Balas.png");
                        bala.setLocation(nave.getX() + 25, 460);
                        lienzo.add(bala);
                        lienzo.repaint();
                        bala.setLocation(nave.getX() + 25, bala.getY() - 10);
                        int movX = 0;
                        for (int i = 0; i < 100; i += 5) {
                            if (movX == 0) {
                                bala.setLocation(nave.getX() + 25, bala.getY() + 10);
                                movX = 1;
                            } else {
                                bala.setLocation(nave.getX() + 25, bala.getY() - 10);
                                movX = 0;
                            }
                            bala.setLocation(nave.getX() + 25, bala.getY() - i);
                            Thread.sleep(100);
                        }
                        break;
                        
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
     * @return the mover
     */
    public int getMover() {
        return mover;
    }

    /**
     * @param mover the mover to set
     */
    public void setMover(int mover) {
        this.mover = mover;
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

}
