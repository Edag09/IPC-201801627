package Cola;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Cola {

    private NodoCola raiz;
    private int tamanio;

    public Cola() {
        this.raiz = null;
        this.tamanio = 1;
    }

    public void pushC(int valor, Color color) {
        NodoCola nuevo = new NodoCola(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
            nuevo.setTamanioC(tamanio);
            tamanio++;
        } else {
            NodoCola aux = this.getRaiz();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setTamanioC(tamanio);
            tamanio++;
        }
        
    }

 
    public NodoCola popC() {
        NodoCola aux = null;
        if (this.getRaiz() != null) {
            aux = this.getRaiz();
            if (this.getRaiz() != null) {
                this.setRaiz(aux.getSiguiente());
            }else {
                this.setRaiz(null);
            }
            return aux;
        }
        JOptionPane.showMessageDialog(null,"La Cola esta Vacia");
        return aux;
    }
    
    
    public String GraphvizCola() {
        String valor = "digraph G {\n";
        NodoCola aux = getRaiz();
        int cont=1;
        if (aux != null) {
            valor = valor+cont+"[label = inicio]\n"+cont+"->"+ (cont+1) +"\n";
            while (aux.getSiguiente() != null) {
                valor = valor + (cont+1) + "[label =\"" + aux.getValor() + "\"fillcolor=\"green\",style=filled ]\n" + (cont+1) + "->" +(cont+2) + "\n";
                aux = aux.getSiguiente();
        cont++;
            }
        valor = valor+(cont+1)+ "[label =\"" + aux.getValor() + "\"fillcolor=\"green\",style=filled ]\n";
        
        }
        valor = valor+"}";        
        return valor;
    }
    
    public void VaciarCola(){
    this.setRaiz(null);
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
