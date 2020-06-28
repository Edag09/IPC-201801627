package HT4T4;

public class NodoCircular {
    private int id;
    private String valor;
    private NodoCircular siguiente;

    public NodoCircular(int id, String valor) {
        this.id = id;
        this.valor = valor;
        this.siguiente = this;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public NodoCircular getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
}
