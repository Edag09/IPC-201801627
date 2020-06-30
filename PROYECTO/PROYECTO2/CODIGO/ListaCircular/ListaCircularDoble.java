package ListaCircular;

import java.awt.Color;

public class ListaCircularDoble {
    private NodoDobleCircular raiz;
    private int tamanio;

    public ListaCircularDoble() {
        this.raiz = null;
        this.tamanio =1;
    }
    
    public void insertarDC(int valor, Color color){
        NodoDobleCircular nuevo = new NodoDobleCircular(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
            this.getRaiz().setSiguiente(nuevo);
            this.getRaiz().setAnterior(nuevo);
            nuevo.setTamanioDC(tamanio);
            tamanio++;
        }else{
            NodoDobleCircular aux = this.getRaiz();
            while (aux.getSiguiente() != this.getRaiz()) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(this.getRaiz());
            this.getRaiz().setAnterior(nuevo);
            nuevo.setTamanioDC(tamanio);
            tamanio++;
        }
        
    }
    
    public void imprimir(){
        NodoDobleCircular aux = getRaiz();
        while(aux.getSiguiente() != getRaiz()){            
            System.out.println("Valor: "+aux.getValorDC()+"\nColor: "+aux.getColorDC()+"\nID: "+aux.getTamanioDC());
            aux = aux.getSiguiente();
        }
        System.out.println("Valor: "+aux.getValorDC()+"\nColor: "+aux.getColorDC()+"\nID: "+aux.getTamanioDC());
            
    }
    
    public String GraphvizCD(){
    String valor ="digraph G {\n";
         NodoDobleCircular aux = getRaiz();
         if (aux != null) {
            while (aux.getSiguiente() != getRaiz()){
            valor = valor+aux.getTamanioDC()+"[label =\""+aux.getValorDC()+"\"fillcolor=\"red\",style=filled ]\n";
            if (aux.getSiguiente() != null) {
            valor = valor+aux.getTamanioDC()+ "->"+(aux.getTamanioDC()+1)+"\n";
            valor = valor+(aux.getTamanioDC()+1)+"->"+aux.getTamanioDC()+"\n";
            }
            aux = aux.getSiguiente();
        }
        valor = valor+aux.getTamanioDC()+"[label =\""+aux.getValorDC()+"\"fillcolor=\"red\",style=filled ]\n";
        valor = valor+(aux.getTamanioDC())+"->"+getRaiz().getTamanioDC()+"\n";
        valor = valor+getRaiz().getTamanioDC()+"->"+(aux.getTamanioDC())+"\n";
        }
         valor = valor+"}";
        return valor;
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
