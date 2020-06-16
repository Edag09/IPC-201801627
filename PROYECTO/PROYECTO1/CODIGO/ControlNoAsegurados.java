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
}
