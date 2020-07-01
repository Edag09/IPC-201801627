package ListaDoble;

import java.awt.Color;
import javax.swing.JOptionPane;

public class ListaDoble {

    private NodoDoble raiz;
    private int tamanio;

    public ListaDoble() {
        this.raiz = null;
        this.tamanio = 1;
    }

    public void insertarD(int valor, Color color) {
        NodoDoble nuevo = new NodoDoble(valor, color);
        if (this.getRaiz() == null) {
            this.setRaiz(nuevo);
            nuevo.setTamanio(tamanio);
            tamanio++;
        } else {
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

    public void mostrar() {
        NodoDoble aux = this.getRaiz();
        while (aux != null) {
            System.out.println("Valor: " + aux.getValor() + "\nColor: " + aux.getColor() + "\nID: " + aux.getTamanio());
            aux = aux.getSiguiente();
        }
        System.out.println("Vacia");
    }

    public String GraphvizDoble() {
        String valor = "digraph G {\n";
        NodoDoble aux = this.getRaiz();
        int cont = 1;
        while (aux != null) {
            valor = valor + cont + "[label =\"" + aux.getValor() + "\"fillcolor=\"blue\",style=filled ]\n";
            if (aux.getSiguiente() != null) {
                valor = valor + cont + "->" + (cont + 1) + "\n";
                valor = valor + (cont + 1) + "->" + cont + "\n";
            }
            aux = aux.getSiguiente();
            cont++;
        }
        valor = valor + "}";
        return valor;
    }

    public void EliminarDoble(int valor) {
        NodoDoble aux = getRaiz();
        if (aux == null) {
            JOptionPane.showMessageDialog(null, "Lista Doble Vacia");
        } else if (this.getRaiz().getValor() == valor) {
            if (this.getRaiz().getSiguiente() == null) {
                this.setRaiz(null);
            } else {
                this.setRaiz(raiz.getSiguiente());
                this.getRaiz().setAnterior(null);
            }
        } else {
            while (aux.getSiguiente() != null) {
                if (aux.getSiguiente().getValor() == valor) {
                    if (aux.getSiguiente() == null) {
                        aux.setSiguiente(null);
                        aux.getSiguiente().setAnterior(null);
                    } else {
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        aux.getSiguiente().getSiguiente().setAnterior(aux);
                        break;
                    }
                }
                aux = aux.getSiguiente();
            }

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
