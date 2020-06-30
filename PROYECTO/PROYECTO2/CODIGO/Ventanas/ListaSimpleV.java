package Ventanas;


import ListaSimple.ListaSimple;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ListaSimpleV extends JFrame{

    ListaSimple lista;
    private JLabel val, color;
    private JTextField txtVal, txtColor;
    private Container lienzo;
    private JTextArea GraphSimple;
    private JButton add, eliminar;
    
    public ListaSimpleV(ListaSimple lista){
        this.setTitle("Lista Simple");
        this.setBounds(350, 100, 450, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.lista = lista;
        
        
        val = new JLabel("Valor");
        val.setBounds(50, 20, 50, 25);
        val.setFont(new Font("Cavolini", Font.PLAIN, 16));
        
        txtVal = new JTextField();
        txtVal.setBounds(50, 50, 100, 25);
        
        color = new JLabel("Color");
        color.setBounds(180, 20, 60, 25);
        color.setFont(new Font("Cavolini", Font.PLAIN, 16));
        
        txtColor = new JTextField();
        txtColor.setBounds(180, 50, 100, 25);
        
        add = new JButton("Agregar");
        add.setBounds(300, 50, 110, 30);
        add.setFont(new Font("Retrow Mentho", Font.PLAIN, 15));
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        ActionListener agregar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (txtVal.getText().isEmpty() || txtColor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Completar Campos");
                    }else{
                    int valor = Integer.parseInt(txtVal.getText());
                    String color = String.valueOf(txtColor.getText());
                    lista.AddSimple(0, 0, valor, colores(color));
                    GraphSimple.setText(lista.GraphvizSimple());
                    JOptionPane.showMessageDialog(null, "Agregado");
                    txtVal.setText("");
                    txtColor.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresa los datos correctos");
                }
            }
        };
        add.addActionListener(agregar);
        
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(300, 150, 110, 30);
        eliminar.setFont(new Font("Retrow Mentho", Font.PLAIN, 15));
        eliminar.setForeground(Color.WHITE);
        eliminar.setBackground(Color.BLACK);
        
        GraphSimple = new JTextArea();
        GraphSimple.setBounds(50, 90, 225, 375);
        GraphSimple.setEditable(false);
        
        GraphSimple.setText(lista.GraphvizSimple());
        
        lienzo = this.getContentPane();
        lienzo.add(val);
        lienzo.add(txtVal);
        lienzo.add(color);
        lienzo.add(txtColor);
        lienzo.add(add);
        lienzo.add(GraphSimple);
        lienzo.add(eliminar);
        
    }
    
       public Color colores(String col) {
        Color color = null;
        switch (col) {
            case "ROJO":
                color = Color.RED;
                break;
            case "AZUL":
                color = Color.BLUE;
                break;
            case "AMARILLO":
                color = Color.YELLOW;
                break;
            case "VERDE":
                color = Color.GREEN;
                break;
        }
        return color;
    }
}
