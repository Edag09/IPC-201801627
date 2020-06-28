package HT4T4;

public class ListaCircular {
    private NodoCircular cabeza;

    public ListaCircular() {
    this.cabeza = null;
    }
    
    public void agregar(int id, String valor){
        NodoCircular nuevo = new NodoCircular(id, valor);
        nuevo.setSiguiente(cabeza);
        if (this.cabeza == null) {
            this.cabeza = nuevo;
            nuevo.setSiguiente(this.cabeza);
        }else{
            NodoCircular aux = this.cabeza;
            while (aux.getSiguiente() != cabeza) {                
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(this.cabeza);
        }
    }
    
    public void mostrar(){
        NodoCircular aux = cabeza;
       do {            
            System.out.println("ID: "+aux.getId()+"\nValor: "+aux.getValor());
            aux = aux.getSiguiente();
        } while (aux != cabeza);
       
    }
    
    public String modificar(int id,String nombre){
        NodoCircular aux = cabeza;
        do {            
            if (aux.getId() == id) {
                 aux.setValor(nombre);
                return aux.getValor();
            }else{
                aux = aux.getSiguiente();
            }
        } while (aux != cabeza);
        return null;
    }
    
    public String Dibujar(){
        String valor ="";
        NodoCircular aux = cabeza;
        int cont =0;
        while (aux.getSiguiente() != cabeza) {            
            valor = valor+cont+"[label =\""+aux.getValor()+"\"]\n"+cont+ "->"+(cont+1)+"\n";
            aux = aux.getSiguiente();
            cont++;
        }
        valor = valor+cont+"[label =\""+aux.getValor()+"\"]\n";
        valor = valor+cont+"->0\n";
        return valor;
    }

    /**
     * @return the cabez
     */
    public NodoCircular getCabeza() {
        return cabeza;
    }

    /**
     * @param cabez the cabez to set
     */
    public void setCabeza(NodoCircular cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
