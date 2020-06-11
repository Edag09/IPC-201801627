package Org.EduardoAgustin.Clases;

import javax.swing.JOptionPane;


public class ControladorPersonas {
    DatosPersonas persona[];
    int contador;

    public ControladorPersonas() {
        this.persona=new DatosPersonas[20];
        this.contador =0;
    }

    public void solicitarSeguro(DatosPersonas solicitantes){
        if (this.contador <=19) {
            this.persona[this.contador] = solicitantes; 
            this.contador++;
        }else{
            JOptionPane.showMessageDialog(null, "Espacio Insuficiente");
        }
    }
    
    public void mostrar(){
        int personaActual;
        for (personaActual = 0; personaActual < this.contador; personaActual++) {
            DatosPersonas solicitantes = this.persona[personaActual];
            JOptionPane.showMessageDialog(null, "Los datos personales son: \nNombre: "+solicitantes.getNombre()+"\nApellido: "+solicitantes.getApellido()+"\nDPI: "+solicitantes.getDpi()
            +"\nTelefono: "+solicitantes.getTelefono()+"\nTipo de Vehiculo: "+solicitantes.getTipoVehiculo()+"\nUso del Vehiculo: "+solicitantes.getUsoVehiculo()
            +"\nMarca del Vehiculo: "+solicitantes.getMarca()+"\nValor del Vehiculo: "+solicitantes.getValvehiculo());
        }
    
    }
    
    public boolean validacionDpi(long dpi){
        String DPI = String.valueOf(dpi);
        int personaActual;
        for (personaActual = 0; personaActual < this.contador; personaActual++) {
             DatosPersonas solicitantes = this.persona[personaActual];
             if (DPI.equalsIgnoreCase(solicitantes.getDpi())) {
                 return true;
            } 
             
        }
        return false;
    }
    
    
    
}
