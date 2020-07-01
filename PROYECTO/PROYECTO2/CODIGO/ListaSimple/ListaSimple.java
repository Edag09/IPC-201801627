package ListaSimple;

import java.awt.Color;
import javax.swing.JOptionPane;

public class ListaSimple {

    private NodoSimple cabeza;
    private int tamanio;

    public ListaSimple() {
        this.cabeza = null;
        this.tamanio = 1;
    }

    public void AddSimple(int fila, int columna, int valor, Color color) {
        NodoSimple nuevo = new NodoSimple(fila, columna, valor, color);
        if (this.getCabeza() == null) {
            this.setCabeza(nuevo);
            nuevo.setCont(tamanio);
            this.tamanio++;
        } else {
            NodoSimple aux = this.getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setCont(tamanio);
            this.tamanio++;
        }
    }

    public void imprimir() {
        NodoSimple aux = this.getCabeza();
        while (aux != null) {
            JOptionPane.showMessageDialog(null,
                    "Fila: " + aux.getFila() + "\n "
                    + "Columna: " + aux.getColumna() + "\n"
                    + "valor: " + aux.getValor() + "\n"
                    + "Color: " + aux.getColor() + "\n"
                    + "\nId: " + aux.getCont());
            aux = aux.getSiguiente();
        }
    }

    public String GraphvizSimple() {
        String valor = "digraph G {\n";
        NodoSimple aux = getCabeza();
        int cont=1;
        if (aux != null) {
            while (aux.getSiguiente() != null) {
                valor = valor + cont + "[label =\"" + aux.getValor() + ", Color =" + colores(aux.getColor()) + "\" ]\n" + cont + "->" + (cont + 1) + "\n";
                aux = aux.getSiguiente();
                cont++;
            }
            valor = valor + cont + "[label =\"" + aux.getValor() + ", Color =" + colores(aux.getColor()) + "\" ]\n";
        }
        valor = valor + "}";
        return valor;
    }

    public void Eliminar(int valor) {
        NodoSimple aux = getCabeza();
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        } else if (this.getCabeza().getValor() == valor) {
            this.setCabeza(cabeza.getSiguiente());
        } else {
            while (aux.getSiguiente() != null) {
                if (aux.getSiguiente().getValor() == valor) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    break;
                } else if (aux.getSiguiente().getValor() == valor) {
                    aux.setSiguiente(null);
                }
                aux = aux.getSiguiente();
            }

        }
    }

    public String colores(Color color) {
        NodoSimple aux = cabeza;
        while (aux != null) {
            if (color == Color.RED) {
                return "Rojo";
            } else if (color == Color.YELLOW) {
                return "Amarillo";
            } else if (color == Color.GREEN) {
                return "Verde";
            } else if (color == Color.BLUE) {
                return "Azul";
            }
        }
        return null;
    }

//  "\""+color+"\
    /**
     * @return the cabeza
     */
    public NodoSimple getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoSimple cabeza) {
        this.cabeza = cabeza;
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
