package ListaDoble;

import javafx.scene.paint.Color;

public class ListaDoble {

    private NodoDoble raiz;

    public ListaDoble() {
    this.raiz=null;
    }
    
    public void insertarD(int valor, Color color){
        NodoDoble nuevo = new NodoDoble(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
        }else{
            NodoDoble aux = this.getRaiz();
            while (aux.getSiguiente() != null) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
    }
    
    public void mostrar(){
        NodoDoble aux = this.getRaiz();
        while ( aux != null) {            
            System.out.println("Valor: "+aux.getValor()+"\nColor: "+aux.getColor());
            aux = aux.getSiguiente();
        }
    }

    /**
     * @return the raiz
     */
    public NodoDoble getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoDoble raiz) {
        this.raiz = raiz;
    }
    
    
}
