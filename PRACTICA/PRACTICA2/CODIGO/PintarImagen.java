package Org.EduardoAgustin.Clases;

import javax.swing.JLabel;

public class PintarImagen extends Thread{
    private JLabel imagen, lie;
    Imagenes incertar = new Imagenes();
    
    
    public PintarImagen(JLabel img,JLabel lienzo) {
    this.imagen = img;
    this.lie = lienzo;
    }
    
    public JLabel pintar(JLabel imagen, int aleatorio, String dircImagen){
        imagen = new JLabel();
        imagen.setBounds(aleatorio, -100, 90, 90);
        incertar.Imagenes(imagen, dircImagen);
        lie.add(imagen);
        return imagen;
        
    }
    
    
    @Override
    public void run(){
         while (true) {            
           try {
                Thread.sleep(200);
                getImagen().setLocation(this.getImagen().getX(), this.getImagen().getY()+10);
                lie.repaint();
           } catch (InterruptedException ex) {
           }          
        }
    
    }

    /**
     * @return the imagen
     */
    public JLabel getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }


}
