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
         int cont=1;
         if (aux != null) {
            while (aux.getSiguiente() != getRaiz()){
            valor = valor+cont+"[label =\""+aux.getValorDC()+"\"fillcolor=\"red\",style=filled ]\n";
            if (aux.getSiguiente() != null) {
            valor = valor+cont+ "->"+(cont+1)+"\n";
            valor = valor+(cont+1)+"->"+cont+"\n";
            }
            aux = aux.getSiguiente();
            cont++;
        }
        valor = valor+(cont)+"[label =\""+aux.getValorDC()+"\"fillcolor=\"red\",style=filled ]\n";
        valor = valor+(cont)+"->"+1+"\n";
        valor = valor+1+"->"+(cont)+"\n";
        
        }
         valor = valor+"}";
        return valor;
    }
    
    public void eliminar(int valor){
    NodoDobleCircular aux = this.raiz;
        if (this.raiz.getSiguiente() == raiz) {
            this.raiz = null;
        }else{
            if (aux.getValorDC() == valor) {
                while (aux.getSiguiente() != this.raiz) {                    
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                this.raiz = this.raiz.getSiguiente();
                aux.getSiguiente().getSiguiente().setAnterior(aux);
                
            }else{
                while (aux.getSiguiente() != this.raiz) {                    
                    if (aux.getSiguiente().getValorDC()== valor) {
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        aux.getSiguiente().setAnterior(this.getRaiz().getSiguiente());
                    }else{
                        aux = aux.getSiguiente();
                    }
                }
            }
        }
    }
    
    public void VaciarCD(){
    this.setRaiz(null);
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
