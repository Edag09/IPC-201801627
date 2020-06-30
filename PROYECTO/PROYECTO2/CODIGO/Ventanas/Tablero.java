package Ventanas;

import Clases.Boton;
import Clases.MovimientoHilo;
import Cola.Cola;
import ListaCircular.ListaCircularDoble;
import ListaDoble.ListaDoble;
import ListaSimple.ListaSimple;
import Pila.Pila;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tablero extends JFrame {
    private JButton CargarDatos, Reiniciar;
    private JButton ListaCircular, ListaSimple, ListaDoble, Pila, Cola, Jugador1;
    private Container lienzo;
    JPanel panelito;
    MovimientoHilo mov;
    Boton btn;
    ListaSimple lista = new ListaSimple();
    ListaDoble listaD = new ListaDoble();
    ListaCircularDoble listaCD = new ListaCircularDoble();
    Pila pila = new Pila();
    Cola cola = new Cola();

    public Tablero() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tablero");
        this.setBounds(300, 130, 750, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);

        CargarDatos = new JButton("Cargar Datos");
        CargarDatos.setBounds(20, 20, 140, 30);
        CargarDatos.setFont(new Font("Retrow Mentho", Font.PLAIN, 16));
        CargarDatos.setForeground(Color.WHITE);
        CargarDatos.setBackground(Color.BLACK);
        ActionListener bai = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                CargaDeDatos cd = new CargaDeDatos(panelito,lista);
                cd.setVisible(true);
            }
        };
        CargarDatos.addActionListener(bai);
        
        Reiniciar = new JButton("Reiniciar");
        Reiniciar.setBounds(20, 70, 110, 30);
        Reiniciar.setFont(new Font("Retrow Mentho", Font.PLAIN, 18));
        Reiniciar.setForeground(Color.WHITE);
        Reiniciar.setBackground(Color.BLACK);
        
        ListaCircular = new JButton("Lista Circular");
        ListaCircular.setBounds(200, 45, 130, 30);
        ListaCircular.setFont(new Font("Retrow Mentho", Font.PLAIN, 16));
        ListaCircular.setForeground(Color.WHITE);
        ListaCircular.setBackground(Color.BLACK);
        ActionListener lisCD = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               CircularDobleV cd = new CircularDobleV(listaCD);
               cd.setVisible(true);
            }
        };
        ListaCircular.addActionListener(lisCD);
        
        
        ListaSimple = new JButton("Lista Simple");
        ListaSimple.setBounds(360, 20, 130, 30);
        ListaSimple.setFont(new Font("Retrow Mentho", Font.PLAIN, 16));
        ListaSimple.setForeground(Color.WHITE);
        ListaSimple.setBackground(Color.BLACK);
        ActionListener listaS = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               ListaSimpleV lis = new ListaSimpleV(lista);
               lis.setVisible(true);
            }
        };
        ListaSimple.addActionListener(listaS);
        
        ListaDoble = new JButton("Lista Doble");
        ListaDoble.setBounds(360, 70, 130, 30);
        ListaDoble.setFont(new Font("Retrow Mentho", Font.PLAIN, 16));
        ListaDoble.setForeground(Color.WHITE);
        ListaDoble.setBackground(Color.BLACK);
        ActionListener lisD = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ListaDobleV doble = new ListaDobleV(listaD);
                doble.setVisible(true);
            }
        };
        ListaDoble.addActionListener(lisD);
        
        Pila = new JButton("Pila");
        Pila.setBounds(530, 20, 90, 30);
        Pila.setFont(new Font("Retrow Mentho", Font.PLAIN, 16));
        Pila.setForeground(Color.WHITE);
        Pila.setBackground(Color.BLACK);
        ActionListener pil = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                PilaV pilita = new PilaV(pila);
                pilita.setVisible(true);
            }
        };
        Pila.addActionListener(pil);
        
        
        Cola = new JButton("Cola");
        Cola.setBounds(530, 70, 90, 30);
        Cola.setFont(new Font("Retrow Mentho", Font.PLAIN, 16));
        Cola.setForeground(Color.WHITE);
        Cola.setBackground(Color.BLACK);
        ActionListener col = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                ColaV col = new ColaV(cola);
                col.setVisible(true);
            }
        };
        Cola.addActionListener(col);
        
        panelito = new JPanel();
        panelito.setLayout(null);
        panelito.setBounds(25, 125, 700, 500);
        panelito.setBackground(Color.WHITE);
        
        lienzo = this.getContentPane();
        lienzo.add(CargarDatos);
        lienzo.add(Reiniciar);
        lienzo.add(ListaCircular);
        lienzo.add(ListaDoble);
        lienzo.add(ListaSimple);
        lienzo.add(Cola);
        lienzo.add(Pila);
        lienzo.add(panelito);
        
        
        mov = new MovimientoHilo(Jugador1, panelito,0,lista,listaD,listaCD,pila,cola);
        Jugador1 = new JButton();
        Jugador1.setBounds(0, 0, 100, 100);
        Jugador1.setBackground(Color.BLACK);
        panelito.add(Jugador1);
        mov.setJugador1(Jugador1);
        Jugador1.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            switch (ke.getExtendedKeyCode()) {
                    case KeyEvent.VK_RIGHT:
                         mov.setMov(1);
                        break;
                    case KeyEvent.VK_LEFT:
                        mov.setMov(2);
                        break;
                    case KeyEvent.VK_UP:
                        mov.setMov(4);
                        break;
                    case KeyEvent.VK_DOWN:
                        mov.setMov(3);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            
            }
        });
        
        mov.start();

    }

    /**
     * @return the panelito
     */
    public JPanel getPanelito() {
        return panelito;
    }

    /**
     * @param panelito the panelito to set
     */
    public void setPanelito(JPanel panelito) {
        this.panelito = panelito;
    }

}
