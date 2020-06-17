package Org.EduardoAgustin.Clases;

public class ControlNoAsegurados {
    public static DatosNoAsegurados noAsegurados[] = new DatosNoAsegurados[25];
    public static int cont=0;
    
    public void ingresarNoAsegurados(String nombre,String dpi,String telefono){
        for (int i = 0; i < noAsegurados.length; i++) {
            if (noAsegurados[i] == null) {
                noAsegurados[i] = new DatosNoAsegurados(nombre, dpi, telefono);
                cont++;
                break;
            }
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < noAsegurados.length; i++) {
            if (noAsegurados[i] != null) {
                System.out.println("Nombre: "+noAsegurados[i].getNombre()+"\nDPI: "+noAsegurados[i].getDpi()+"\nTelefono: "+noAsegurados[i].getTelefono());
            }
        }
    }
    
    public boolean ValidacionDPI(String dpi){
        for (int i = 0; i < noAsegurados.length; i++) {
            if (noAsegurados[i] != null) {
                if (noAsegurados[i].getDpi().equalsIgnoreCase(dpi)) {
                    return true;
                }
            }else{
            break;
            }
        }
        return false;
    }
    
    public String RetornarNombre(String dpi){
        for (int i = 0; i < noAsegurados.length; i++) {
            if (noAsegurados[i] != null) {
                if (noAsegurados[i].getDpi().equalsIgnoreCase(dpi)) {
                    return noAsegurados[i].getNombre();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public String RetornarTelefono(String dpi){
        for (int i = 0; i < noAsegurados.length; i++) {
            if (noAsegurados[i] != null) {
                if (noAsegurados[i].getDpi().equalsIgnoreCase(dpi)) {
                    return noAsegurados[i].getTelefono();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public String RetornarDPI(String dpi){
        for (int i = 0; i < noAsegurados.length; i++) {
            if (noAsegurados[i] != null) {
                if (noAsegurados[i].getDpi().equalsIgnoreCase(dpi)) {
                    return noAsegurados[i].getDpi();
                }
            }else{
                break;
            }
        }
        return null;
    }
}
