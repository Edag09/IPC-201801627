package Video;

import javax.swing.JOptionPane;

public class Pila {
    private NodoPila raiz;

    public Pila() {
        this.raiz = null;
    }
    
    public void push(String dato) {
        NodoPila nuevo = new NodoPila(dato);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
        } else {
            nuevo.setSiguiente(this.getRaiz());
            this.setRaiz(nuevo);
        }
    }
    
    public NodoPila pop() {
        NodoPila retorno = this.getRaiz();
        if (retorno != null) {
            this.setRaiz(this.getRaiz().getSiguiente());
            return retorno;
        } else {
            JOptionPane.showMessageDialog(null,"La Pila esta Vacia");
        }
        return null;
    }
    
    public String GraphvizPila() {
        String valor = "digraph G {\n";
        NodoPila aux = this.getRaiz();
        int cont =1;
        if (aux != null) {
            while (aux.getSiguiente() != null){ 
            valor = valor +(cont)+ "[label =" + aux.getDato() +"]\n" + (cont) + "->" + (cont+1) + "\n";
            aux = aux.getSiguiente();
            cont++;
            }
            
        valor = valor+(cont)+"[label =" + aux.getDato() +"]\n";
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
    
    
}
