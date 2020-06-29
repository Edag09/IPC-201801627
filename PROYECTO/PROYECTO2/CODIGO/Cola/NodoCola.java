package Cola;

import javafx.scene.paint.Color;

public class NodoCola {

    private int tamanioC;
    private int Valor;
    private Color color;
    private NodoCola siguiente;

    public NodoCola(int Valor, Color color) {
        this.Valor = Valor;
        this.color = color;
        this.siguiente = null;
    }

    /**
     * @return the tamanioC
     */
    public int getTamanioC() {
        return tamanioC;
    }

    /**
     * @param tamanioC the tamanioC to set
     */
    public void setTamanioC(int tamanioC) {
        this.tamanioC = tamanioC;
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
    public NodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
