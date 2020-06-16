package Org.EduardoAgustin.Clases;

import javax.swing.JOptionPane;

public class ControladorPersonas {
    public static DatosPersonas persona[] = new DatosPersonas[25];
    public static int cont=0;


    public  void solicitarSeguro(String nombre,String apellito,String  TipoVehiculo,String UsoVehiculo,String MarcaVehiculo,String dpi,String linea,int telefono, int modelo,double valvehiculo){
        for (int i = 0; i < persona.length; i++) {
              if (persona[i]==null) {
                persona[i] = new DatosPersonas(nombre, apellito,  TipoVehiculo, UsoVehiculo, MarcaVehiculo, dpi, linea ,telefono, modelo, valvehiculo); 
                cont++;
                break;
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                JOptionPane.showMessageDialog(null, "Nombre: "+persona[i].getNombre()+"\nApellido: "+persona[i].getApellido()+"\nDPI: "+persona[i].getDpi()
                +"\nTelefono: "+persona[i].getTelefono()+"\nTipo de Vehiculo: "+persona[i].getTipoVehiculo()+"\nUso Vehiculo: "+persona[i].getUsoVehiculo()
                +"\nMarca Vehiculo: "+persona[i].getMarca()+"\nLinea de Auto: "+persona[i].getLinea()+"\nModelo de Vehiculo: "+persona[i].getModelo()
                +"\nValor Vehiculo: "+persona[i].getValvehiculo());
            }
        }
    }
    
    public boolean ValidacionDPI(String dpi){
        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                if (persona[i].getDpi().equalsIgnoreCase(dpi)) {
                    return true;
                }
            }else{
            break;
            }
        }
        return false;
    }

    public String RetornarNombre(String dpi){
        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                if (persona[i].getDpi().equalsIgnoreCase(dpi)) {
                    return persona[i].getNombre();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public int RetornarTelefono(String dpi){
        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                if (persona[i].getDpi().equalsIgnoreCase(dpi)) {
                    return persona[i].getTelefono();
                }
            }else{
                break;
            }
        }
        return 0;
    }
    
    public String RetornarDPI(String dpi){
        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                if (persona[i].getDpi().equalsIgnoreCase(dpi)) {
                    return persona[i].getDpi();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public String MostrarDPI(String dpi){ 
        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                if (persona[i].getDpi().equalsIgnoreCase(dpi)) {
                    return persona[i].getDpi();
                }
            }else{
                break;
            }
        }
        return null;
    }
}
