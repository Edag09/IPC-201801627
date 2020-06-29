package Pila;

import javafx.scene.paint.Color;

public class NodoPila {
  private int Valor;
  private int tamanioP;
  private Color color;
  private NodoPila siguiente;

    public NodoPila(int Valor, Color color) {
        this.Valor = Valor;
        this.color = color;
        this.siguiente = null;
    }

    /**
     * @return the Valor
     */
    public int getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the tamanioP
     */
    public int getTamanioP() {
        return tamanioP;
    }

    /**
     * @param tamanioP the tamanioP to set
     */
    public void setTamanioP(int tamanioP) {
        this.tamanioP = tamanioP;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the siguiente
     */
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
  
  
}
