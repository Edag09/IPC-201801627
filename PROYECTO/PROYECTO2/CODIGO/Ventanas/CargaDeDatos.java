package Ventanas;

import ListaSimple.ListaSimple;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class CargaDeDatos extends JFrame {
    
    Tablero colocar = new Tablero();
    JLabel nombre;
    JTextArea carga;
    JButton cargar, salir, abrir;
    Container lienzo;
    JPanel panel;
    ListaSimple lista;
    FileReader fr;
    BufferedReader br;
    JButton boton;
    
    
    public CargaDeDatos(JPanel panel, ListaSimple lista,JButton bloquecito) {
        this.setTitle("Carga de Datos");
        this.setBounds(350, 100, 450, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.panel = panel;
        this.lista = lista;
        this.boton = bloquecito;

        nombre = new JLabel("Cargar Datos", SwingConstants.CENTER);
        nombre.setBounds(100, 30, 120, 25);
        nombre.setFont(new Font("Cavolini", Font.PLAIN, 18));

        carga = new JTextArea();
        carga.setBounds(20, 80, 400, 250);
        carga.setBackground(Color.LIGHT_GRAY);
        carga.setForeground(Color.BLACK);

        abrir = new JButton("Abrir");
        abrir.setBounds(20, 380, 80, 30);
        ActionListener abrirD = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser seleccionar = new JFileChooser();
                seleccionar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                seleccionar.showOpenDialog(seleccionar);
                File archivo = seleccionar.getSelectedFile();
                try {
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String cadena;
                    String aux = "";
                    while ((cadena = br.readLine()) != null) {
                        aux = aux + cadena + "\n";
                    }
                    carga.setText(aux);
                } catch (Exception e) {
                }
            }
        };
        abrir.addActionListener(abrirD);

        cargar = new JButton("Cargar");
        cargar.setBounds(185, 380, 80, 30);
        ActionListener cargarD = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (carga.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingresa Datos");
                    } else {
                        String s1[] = carga.getText().split("\n");
                        for (String datos : s1) {
                            String s2[] = datos.split(",");
                            String color = String.valueOf(s2[3]);
                            int f = Integer.parseInt(s2[0]);
                            int c = Integer.parseInt(s2[1]);
                            int v = Integer.parseInt(s2[2]);
                            lista.AddSimple((f * 100), (c * 100), v, colores(color));
                            panel.add(colocar.CrearBotones((f * 100), (c * 100), v, colores(color)));
                            panel.updateUI();
                        }
                        JOptionPane.showMessageDialog(null, "Cargados");
                        carga.setText("");
                        panel.removeAll();
                        panel.add(boton);
                        boton.setBounds(0, 0, 100, 100);
                        
                        
                    }
                } catch (Exception e) {
                }
            }
        };
        cargar.addActionListener(cargarD);

        salir = new JButton("Salir");
        salir.setBounds(350, 380, 80, 30);
        ActionListener bai = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CargaDeDatos.this.dispose();
            }
        };
        salir.addActionListener(bai);

        lienzo = this.getContentPane();
        lienzo.add(nombre);
        lienzo.add(carga);
        lienzo.add(abrir);
        lienzo.add(cargar);
        lienzo.add(salir);
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
