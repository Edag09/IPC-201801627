package ListaDoble;

import java.awt.Color;

public class ListaDoble {

    private NodoDoble raiz;
    private int tamanio;

    public ListaDoble() {
    this.raiz=null;
    this.tamanio =1;
    }
    
    public void insertarD(int valor, Color color){
        NodoDoble nuevo = new NodoDoble(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
            nuevo.setTamanio(tamanio);
            tamanio++;
        }else{
            NodoDoble aux = this.getRaiz();
            while (aux.getSiguiente() != null) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setTamanio(tamanio);
            tamanio++;
        }
    }
    
    public void mostrar(){
        NodoDoble aux = this.getRaiz();
        while ( aux != null) {            
            System.out.println("Valor: "+aux.getValor()+"\nColor: "+aux.getColor()+"\nID: "+aux.getTamanio());
            aux = aux.getSiguiente();
        }
        System.out.println("Vacia");
    }

    public String GraphvizDoble(){
    String valor ="digraph G {\n";
        NodoDoble aux = this.getRaiz();
        while (aux != null){
            valor = valor+aux.getTamanio()+"[label =\""+aux.getValor()+"\"fillcolor=\"blue\",style=filled ]\n";
            if (aux.getSiguiente() != null) {
            valor = valor+aux.getTamanio()+ "->"+(aux.getTamanio()+1)+"\n";
            valor = valor+(aux.getTamanio()+1)+"->"+aux.getTamanio()+"\n";
            }
            aux = aux.getSiguiente();
        }
        valor = valor+"}";
        return valor;
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
