package Cola;

import javafx.scene.paint.Color;

public class Cola {

    private NodoCola raiz;
    private int tamanio;

    public Cola() {
        this.raiz = null;
        this.tamanio = 0;
    }

    public void pushC(int valor, Color color) {
        NodoCola nuevo = new NodoCola(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
        } else {
            NodoCola aux = this.getRaiz();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public NodoCola popC() {
        NodoCola aux = null;
        if (this.getRaiz() != null) {
            aux = this.getRaiz();
            if (this.getRaiz() != null) {
                System.out.println("Valor: " + aux.getValor() + "\nColor: " + aux.getColor());
                this.setRaiz(aux.getSiguiente());
            }else {
                this.setRaiz(null);
            }
            return aux;
        }
        System.out.println("Se excedio");
        return aux;
    }

    /**
     * @return the raiz
     */
    public NodoCola getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoCola raiz) {
        this.raiz = raiz;
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
