package ListaSimple;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.*;

public class ListaSimple {

    private NodoSimple cabeza;
    private int tamanio;

    public ListaSimple() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void AddSimple(int fila, int columna, int valor, Color color) {
        NodoSimple nuevo = new NodoSimple(fila, columna, valor, color);
        if (this.getCabeza() == null) {
            this.setCabeza(nuevo);
            nuevo.setCont(tamanio);
            this.tamanio++;
        } else {
            NodoSimple aux = this.getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setCont(tamanio);
            this.tamanio++;
        }
    }

    public void imprimir() {
        NodoSimple aux = this.getCabeza();
        while (aux != null) {
            //imprime la informacion del usuario, siempre y cuando no este vacio
            JOptionPane.showMessageDialog(null,
                    "Fila: " + aux.getFila() + "\n "
                    + "Columna: " + aux.getColumna() + "\n"
                    + "valor: " + aux.getValor() + "\n"
                    + "Color: " + aux.getColor() + "\n"
                    + "\nId: " + aux.getCont());
            aux = aux.getSiguiente();
        }
    }
    
    public void setBoton(JButton boton,JPanel panel){
    NodoSimple aux = this.getCabeza();
    int cont =0;
        while (aux != null) {        
            if (aux.getCont() == cont) {
                aux.setBoton(boton);
                panel.add(aux.getBoton());
            }
            aux = aux.getSiguiente();
            cont++;
        }
    }
    
//  public void quitar(int fila, int columna, JPanel panel){
//      NodoSimple aux = cabeza;
//      while (aux != null){          
//          if (aux.getFila() == fila && aux.getColumna() == columna) {
//              System.out.println(aux.getValor());
//              panel.remove(aux.getBoton());
//              break;
//          }else{
//              aux = aux.getSiguiente();
//          }
//      }
//  }  



    /**
     * @return the cabeza
     */
    public NodoSimple getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoSimple cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

}
