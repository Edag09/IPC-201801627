package Pila;

import java.awt.Color;

public class Pila {

    private NodoPila raiz;
    private int tamanio;

    public Pila() {
        this.raiz = null;
        this.tamanio = 1;
    }

    public void push(int valor, Color color) {
        NodoPila nuevo = new NodoPila(valor, color);
        if (this.raiz == null) {
            this.setRaiz(nuevo);
            nuevo.setTamanioP(tamanio);
            tamanio++;
        } else {
            nuevo.setSiguiente(this.getRaiz());
            this.setRaiz(nuevo);
            nuevo.setTamanioP(tamanio);
            tamanio++;
        }
    }

    public NodoPila pop() {
        NodoPila retorno = this.getRaiz();
        if (retorno != null) {
            this.setRaiz(this.getRaiz().getSiguiente());
            System.out.println("Valor: " + retorno.getValor() + "\nColor: " + retorno.getColor() + "\nID: " + retorno.getTamanioP());
            return retorno;
        } else {
            System.out.println("La pila esta vacia");
        }
        return null;
    }

    public String GraphvizPila() {
        String valor = "digraph G {\n";
        NodoPila aux = this.getRaiz();
        if (aux != null) {
            while (aux.getSiguiente() != null){ 
            valor = valor + aux.getTamanioP()+ "[label =\"" + aux.getValor() + "\"fillcolor=\"yellow\",style=filled ]\n" + aux.getTamanioP() + "->" + (aux.getTamanioP()-1) + "\n";
            aux = aux.getSiguiente();
        }
        valor = valor+aux.getTamanioP()+"[label =\"" + aux.getValor() +"\"fillcolor=\"yellow\",style=filled ]\n";
        }
       valor = valor+"}";
        return valor;
    }

    /**
     * @return the raiz
     */
    public NodoPila getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoPila raiz) {
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
