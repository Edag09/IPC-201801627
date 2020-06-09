package Org.EduardoAgustin.Ventanas;

import Org.EduardoAgustin.Clases.DatosPersonas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {
    
    public JLabel nombreDpi;
    public JTextField txtDPI;
    public JButton iniciar,salir;
    public Container panel;
    DatosPersonas dpi;
    public long Dpi;
    
    public Login(){
        this.dpi = new DatosPersonas();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Login");
    this.setSize(400,150);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setLayout(null);
    
    nombreDpi = new JLabel("DPI: ");
    nombreDpi.setBounds(70, 40, 50, 25);
    nombreDpi.setFont(new Font("Cavolini", Font.ITALIC, 16));
    
    txtDPI = new JTextField();
    txtDPI.setBounds(130, 40, 150, 25);
    
    iniciar = new JButton("Iniciar Sesion");
    iniciar.setBounds(10, 80, 150, 35);
    iniciar.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\iniciar.png"));
    ActionListener log = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if (txtDPI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor llenar campo");
            }else{
               Dpi = Long.parseLong(txtDPI.getText());
                if (dpi.verificar(Dpi)) {
                    JOptionPane.showMessageDialog(null, "Sesion Iniciada");
                }else{
                    JOptionPane.showMessageDialog(null, "No cuentas con seguro");
                }
            }
        }
    };
    iniciar.addActionListener(log);
    
    salir = new JButton("Cancelar");
    salir.setBounds(260, 80, 120, 35);
    salir.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\Regreso.png"));
    ActionListener bai = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
         MenuPrincipal m = new MenuPrincipal();
         m.setVisible(true);
         Login.this.dispose();
        }
    };
    salir.addActionListener(bai);
    
    panel = this.getContentPane();
    panel.add(nombreDpi);
    panel.add(txtDPI);
    panel.add(iniciar);
    panel.add(salir);
    
    }
    
}
