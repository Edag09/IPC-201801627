package Org.EduardoAgustin.Menu;

public class ValidacionPosicion {
    String apuntador;
    boolean encontrado;

    public ValidacionPosicion() {
    }
    
    //metodo para cambiar la casilla cuando sea encontrada
    public void esEncontrado(){
        this.encontrado = true;
    }
    
    //metodo para saber si ya fue encontrada
    public boolean yaEncontrado(){
        return this.encontrado;
    }
    
    //metodo para retornar el simbolo al tablero
    public String getSimbolo(){
        return this.apuntador;
    }
    
    //metoto para retornar el simbolo en pantalla
    public String getDisplaySimbolo(){
    return this.apuntador = "x";
    }
    
    
}
