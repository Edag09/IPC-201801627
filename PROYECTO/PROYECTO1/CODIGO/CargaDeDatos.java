package Org.EduardoAgustin.Ventanas;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CargaDeDatos extends JFrame {

    public JLabel txtCarga;
    public JButton cargaMasiva,salir;
    public JTextArea areadeCarga;
    public Container panel;
    
    public CargaDeDatos(){
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Carga de Datos");
    this.setSize(430,350);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setLayout(null);
    
    txtCarga = new JLabel("Carga Masiva de Datos");
    txtCarga.setBounds(20, 20, 170, 25);
    txtCarga.setFont(new Font("Cavolini", Font.ITALIC, 16));
    
    areadeCarga = new JTextArea();
    areadeCarga.setBounds(20, 60, 380, 160);
    
    cargaMasiva = new JButton("Cargar Datos");
    cargaMasiva.setBounds(20, 245, 110, 25);
    
    salir = new JButton("Cancelar");
    salir.setBounds(280, 245, 120, 35);
    salir.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\Regreso.png"));
    ActionListener bai = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        CargaDeDatos.this.dispose();
        }
    };
    salir.addActionListener(bai);
    
    panel = this.getContentPane();
    panel.add(txtCarga);
    panel.add(areadeCarga);
    panel.add(cargaMasiva);
    panel.add(salir);
    }
    
    
}
