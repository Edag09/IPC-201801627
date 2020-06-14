package Org.EduardoAgustin.Ventanas;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuPrincipal extends JFrame {
    public JLabel Cargardatos,SolicitarSeguro, IniciarSesion,Salir;
    public JButton CargarDatos, SoliSeguro,Login, salir;
    public Container panel;
    
    public MenuPrincipal(){
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Menu Principal");
    this.setSize(600,350);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setLayout(null);
    
    Cargardatos = new JLabel("Cargar Datos");
    Cargardatos.setBounds(90, 30, 120, 25);
    Cargardatos.setFont(new Font("Orange Juice", Font.ITALIC, 25));
    
    CargarDatos = new JButton();
    CargarDatos.setBounds(15, 15, 70, 70);
    CargarDatos.setIcon(new ImageIcon("C:\\\\Users\\\\Eduardo Agustin\\\\Documents\\\\NetBeansProjects\\\\Proyecto1Vacas\\\\src\\\\Iconos Proyecto\\\\cargamasiva.png"));
    ActionListener datos = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        Carga dato = new Carga();
        dato.setVisible(true);
        MenuPrincipal.this.dispose();
        }
    };
    CargarDatos.addActionListener(datos);
    
    
    SolicitarSeguro = new JLabel("Solicitar Seguro");
    SolicitarSeguro.setBounds(35, 245, 130, 25);
    SolicitarSeguro.setFont(new Font("Orange Juice", Font.ITALIC, 25));
    
    SoliSeguro = new JButton();
    SoliSeguro.setBounds(40, 110, 132, 132);
    SoliSeguro.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\Seguro.png"));
    ActionListener seguro = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        SolicitarSeguro asegurado = new SolicitarSeguro();
        asegurado.setVisible(true);
        MenuPrincipal.this.dispose();
        }
    };
    SoliSeguro.addActionListener(seguro);
    
    IniciarSesion = new JLabel("Iniciar Sesion");
    IniciarSesion.setBounds(235, 245, 110, 25);
    IniciarSesion.setFont(new Font("Orange Juice", Font.ITALIC, 25));
    
    Login = new JButton();
    Login.setBounds(225,110, 132, 132);
    Login.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\Login.png"));
    ActionListener log = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        Log log = new Log();
        log.setVisible(true);
        MenuPrincipal.this.dispose();
        }
    };
    Login.addActionListener(log);
    
    Salir = new JLabel("Salir");
    Salir.setBounds(475, 245, 110, 25);
    Salir.setFont(new Font("Orange Juice", Font.ITALIC, 25));
    
    salir = new JButton();
    salir.setIcon(new ImageIcon("C:\\Users\\Eduardo Agustin\\Documents\\NetBeansProjects\\Proyecto1Vacas\\src\\Iconos Proyecto\\Salir.png"));    
    salir.setBounds(430, 110, 134, 134);
    ActionListener exit = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            MenuPrincipal.this.dispose();
            JOptionPane.showMessageDialog(null, "Gus bai");
            System.exit(0);
        }
    };
    salir.addActionListener(exit);
    
    panel = this.getContentPane();
    panel.add(SolicitarSeguro);
    panel.add(SoliSeguro);
    panel.add(IniciarSesion);
    panel.add(Login);
    panel.add(Salir);
    panel.add(salir);
    panel.add(Cargardatos);
    panel.add(CargarDatos);
    }
    
    
}
