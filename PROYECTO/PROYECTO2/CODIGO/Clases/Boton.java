package Clases;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Boton {
    private JButton jugador;
    private JButton bloquesito;
    private JPanel  panel;
    
    public JButton CrearBotones(int x, int y ,int valor, Color color){
        JButton nuevo = new JButton();
        nuevo.setBounds(y, x,100,100);
        nuevo.setText(valor+"");
        nuevo.setFont(new Font("Arial", Font.PLAIN, 30));
        nuevo.setBackground(color);
        return nuevo;
    }
    


    /**
     * @return the jugador
     */
    public JButton getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(JButton jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the bloquesito
     */
    public JButton getBloquesito() {
        return bloquesito;
    }

    /**
     * @param bloquesito the bloquesito to set
     */
    public void setBloquesito(JButton bloquesito) {
        this.bloquesito = bloquesito;
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
    
    
}
