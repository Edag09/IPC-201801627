package Org.EduardoAgustin.Clases;

import javax.swing.JOptionPane;

public class ControladorPersonas {
    public static DatosPersonas persona[] = new DatosPersonas[25];


    public  void solicitarSeguro(String nombre,String apellito,String  TipoVehiculo,String UsoVehiculo,String MarcaVehiculo,String dpi,String linea,int telefono, int modelo,double valvehiculo){
        for (int i = 0; i < persona.length; i++) {
              if (persona[i]==null) {
                persona[i] = new DatosPersonas(nombre, apellito,  TipoVehiculo, UsoVehiculo, MarcaVehiculo, dpi, linea ,telefono, modelo, valvehiculo); 
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
    
    public String ValidacionDPI(String dpi){
        String dpi2="";
        for (int i = 0; i < persona.length; i++) {
                if (persona[i] != null) {
                if (persona[i].getDpi().equalsIgnoreCase(dpi)) {
                    dpi2= persona[i].getDpi();
            }
            }else{
                break;
                }
        }
        return dpi2;
    }

    
}
