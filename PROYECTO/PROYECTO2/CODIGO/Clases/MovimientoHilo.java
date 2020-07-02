package Clases;

import Cola.Cola;
import ListaCircular.ListaCircularDoble;
import ListaDoble.ListaDoble;
import ListaSimple.ListaSimple;
import ListaSimple.NodoSimple;
import Pila.Pila;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MovimientoHilo extends Thread{

    private JButton jugador1;
    private JPanel panel;
    private int mov;
    ListaSimple listita;
    ListaDoble listaD;
    ListaCircularDoble listaCD;
    Pila pila;
    Cola cola;

    public MovimientoHilo(JButton btnJugar, JPanel panel, int mov, ListaSimple lista, ListaDoble listaD,ListaCircularDoble listaCD, Pila pila,Cola cola) {
        this.jugador1 = btnJugar;
        this.panel = panel;
        this.mov = mov;
        this.listita = lista;
        this.listaCD = listaCD;
        this.listaD = listaD;
        this.pila = pila;
        this.cola= cola;
    }


        @Override
        public void run(){
        
        while (true) {
                try {
                    Thread.sleep(100);
                    switch (mov) {
                        case 1:
                            //Se mueve a la derecha
                            if (getJugador1().getX() < 600) {
                                getJugador1().setLocation(getJugador1().getX() + 100, getJugador1().getY());
                                Comparar();
                                setMov(0);
                            }
                            break;
                        case 2:
                            //Se mueve a la izquierda
                            if (getJugador1().getX() >= 100) {
                                getJugador1().setLocation(getJugador1().getX() - 100, getJugador1().getY());
                                Comparar();
                                setMov(0);
                            }
                            break;
                        case 3:
                            //Se mueve a la abajo
                            if (getJugador1().getY() < 400) {
                                getJugador1().setLocation(getJugador1().getX(), getJugador1().getY() + 100);
                                Comparar();
                                setMov(0);
                            }
                            break;
                        case 4:
                            //Se mueve a la arriba
                            if (getJugador1().getY() >= 100) {
                                getJugador1().setLocation(getJugador1().getX(), getJugador1().getY() - 100);
                                Comparar();
                                setMov(0);
                            }
                            break;

                    }
                } catch (Exception e) {
                }
            }

        }
        /**
         * @return the jugador1
         */
    public JButton getJugador1() {
        return jugador1;
    }

    /**
     * @param jugador1 the jugador1 to set
     */
    public void setJugador1(JButton jugador1) {
        this.jugador1 = jugador1;
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

    /**
     * @return the mov
     */
    public int getMov() {
        return mov;
    }

    /**
     * @param mov the mov to set
     */
    public void setMov(int mov) {
        this.mov = mov;
    }
    
    public void Comparar(){
        NodoSimple aux = listita.getCabeza();
        while (aux != null) {            
            if (jugador1.getX() == aux.getColumna()&& jugador1.getY()== aux.getFila()) {
                
                if (aux.getColor() == Color.RED && aux.isEstado()) {
                    aux.setEstado(false);
                    int valor = aux.getValor();
                    Color color = aux.getColor();
                    System.out.println("Agregado "+aux.getValor());
                    listaCD.insertarDC(valor, color);
                }
                if (aux.getColor() == Color.BLUE && aux.isEstado()) {
                    aux.setEstado(false);
                    int valor = aux.getValor();
                    Color color = aux.getColor();
                    System.out.println("Agregado "+aux.getValor());
                    listaD.insertarD(valor, color);
                }
                if(aux.getColor() == Color.YELLOW && aux.isEstado()){
                    aux.setEstado(false);
                    int valor = aux.getValor();
                    Color color = aux.getColor();
                    System.out.println("Agregado "+aux.getValor());
                    pila.push(valor, color);
                }
                if (aux.getColor() == Color.GREEN && aux.isEstado()) {
                    aux.setEstado(false);
                    int valor = aux.getValor();
                    Color color = aux.getColor();
                    System.out.println("Agregado "+aux.getValor());
                    cola.pushC(valor, color);
                }
            }
            aux = aux.getSiguiente();
        }
    }
    
}
