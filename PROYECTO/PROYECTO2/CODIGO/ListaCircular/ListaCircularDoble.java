package ListaCircular;

import javafx.scene.paint.Color;

public class ListaCircularDoble {
    private NodoDobleCircular raiz;
    private int tamanio;

    public ListaCircularDoble() {
        this.raiz = null;
        this.tamanio =0;
    }
    
    public void insertarDC(int valor, Color color){
        NodoDobleCircular nuevo = new NodoDobleCircular(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
            this.getRaiz().setSiguiente(nuevo);
            this.getRaiz().setAnterior(nuevo);
        }else{
            NodoDobleCircular aux = this.getRaiz();
            while (aux.getSiguiente() != this.getRaiz()) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(this.getRaiz());
            this.getRaiz().setAnterior(nuevo);
        }
        
    }
    
    public void imprimir(){
        NodoDobleCircular aux = getRaiz();
        do{            
            System.out.println("Valor: "+aux.getValorDC()+"\nColor: "+aux.getColorDC()+"\nID: "+aux.getTamanioDC());
            aux = aux.getSiguiente();
        }while(aux != getRaiz());
    }

    /**
     * @return the raiz
     */
    public NodoDobleCircular getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoDobleCircular raiz) {
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
