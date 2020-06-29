package Pila;

import javafx.scene.paint.Color;

public class Pila {
    private NodoPila raiz;
    private int tamanio;

    public Pila() {
    this.raiz = null;
    this.tamanio =0;
    }
    
    public void push(int valor, Color color){
        NodoPila nuevo = new NodoPila(valor, color);
        if (this.raiz == null) {
            this.setRaiz(nuevo);
            this.setTamanio(tamanio);
            tamanio++;
        }else{
          nuevo.setSiguiente(this.getRaiz());
          this.setRaiz(nuevo);
          this.setTamanio(tamanio);
          tamanio++;
        }
    }
    
    
    public NodoPila pop(){
        NodoPila retorno = this.getRaiz();
        if (retorno != null) {
            this.setRaiz(this.getRaiz().getSiguiente());
            System.out.println("Valor: "+retorno.getValor()+"\nColor: "+retorno.getColor());
            return retorno;
        }else{
            System.out.println("La pila esta vacia");
        }
        return null;
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
