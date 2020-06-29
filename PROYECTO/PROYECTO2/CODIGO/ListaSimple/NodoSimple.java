package ListaSimple;

import java.awt.Color;
import javax.swing.JButton;

public class NodoSimple {
    private int fila;
    private int columna;
    private int valor;
    private Color color;
    private NodoSimple siguiente;
    private int cont;
    private JButton boton;
    private boolean estado;
    

    public NodoSimple(int fila, int columna, int valor, Color color) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.color = color;
        this.siguiente = null;
        this.boton = null;
        this.estado = true;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
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
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * @return the boton
     */
    public JButton getBoton() {
        return boton;
    }

    /**
     * @param boton the boton to set
     */
    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
