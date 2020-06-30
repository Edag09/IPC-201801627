package Cola;

import java.awt.Color;

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
                System.out.println("Valor: " + aux.getValor() + "\nColor: " + aux.getColor()+"\nID: "+aux.getTamanioC());
                this.setRaiz(aux.getSiguiente());
            }else {
                this.setRaiz(null);
            }
            return aux;
        }
        System.out.println("Se excedio");
        return aux;
    }
    
    public String GraphvizCola() {
        String valor = "digraph G {\n";
        NodoCola aux = getRaiz();
        int cont=0;
        if (aux != null) {
            valor = valor+cont+"[label = inicio]\n"+cont+"->"+ aux.getTamanioC() +"\n";
            while (aux.getSiguiente() != null) {
                valor = valor + aux.getTamanioC()+ "[label =\"" + aux.getValor() + "\"fillcolor=\"green\",style=filled ]\n" + aux.getTamanioC()+ "->" + (aux.getTamanioC()+ 1) + "\n";
                aux = aux.getSiguiente();
        }
        valor = valor+aux.getTamanioC()+ "[label =\"" + aux.getValor() + "\"fillcolor=\"green\",style=filled ]\n";
        }
        valor = valor+"}";        
        return valor;
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
