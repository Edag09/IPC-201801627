package ListaCircular;

import java.awt.Color;

public class NodoDobleCircular {
    private int tamanioDC;
    private int valorDC;
    private Color colorDC;
    private NodoDobleCircular siguiente;
    private NodoDobleCircular anterior;

    public NodoDobleCircular(int valorDC, Color colorDC) {
        this.valorDC = valorDC;
        this.colorDC = colorDC;
        this.siguiente = this;
        this.anterior = this;
    }

    /**
     * @return the valorDC
     */
    public int getValorDC() {
        return valorDC;
    }

    /**
     * @param valorDC the valorDC to set
     */
    public void setValorDC(int valorDC) {
        this.valorDC = valorDC;
    }

    /**
     * @return the colorDC
     */
    public Color getColorDC() {
        return colorDC;
    }

    /**
     * @param colorDC the colorDC to set
     */
    public void setColorDC(Color colorDC) {
        this.colorDC = colorDC;
    }

    /**
     * @return the siguiente
     */
    public NodoDobleCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDobleCircular siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDobleCircular getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDobleCircular anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the tamanioDC
     */
    public int getTamanioDC() {
        return tamanioDC;
    }

    /**
     * @param tamanioDC the tamanioDC to set
     */
    public void setTamanioDC(int tamanioDC) {
        this.tamanioDC = tamanioDC;
    }
    
    
}
