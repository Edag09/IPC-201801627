package Clases;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Boton {
    
    
    public JButton CrearBotones(int x, int y ,int valor, Color color){
        JButton nuevo = new JButton();
        nuevo.setBounds(y, x,100,100);
        nuevo.setText(valor+"");
        nuevo.setFont(new Font("Arial", Font.PLAIN, 30));
        nuevo.setBackground(color);
        return nuevo;
    }
    
     public JButton CreaBotones(int fila, int columna, Color color, int valor) {
        JButton nuevo = new JButton();
        nuevo.setText(String.valueOf(valor));
        nuevo.setBounds(fila, columna, 100, 100);
        nuevo.setFont(new Font("Arial", Font.PLAIN, 30));
        nuevo.setBackground(color);
        return nuevo;
    }
    
    }
