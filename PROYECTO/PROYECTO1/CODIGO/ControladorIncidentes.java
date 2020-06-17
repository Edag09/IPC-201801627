package Org.EduardoAgustin.Clases;

public class ControladorIncidentes {
 public static DatosIncidentes incidentes[] = new DatosIncidentes[25];
 public static int cont =0;
 
    public void agregarIncidente(String servicio, String repuesto, String total){
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i] == null) {
                incidentes[i] = new DatosIncidentes(servicio, repuesto,total);
                cont++;
                break;
            }
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i] != null) {
                System.out.println("Servicio: "+incidentes[i].getServicio()+"\nRepuesto: "+incidentes[i].getRepuesto()
                +"\nTotal: "+incidentes[i].getTotal());
            }
        }
    }

    public double Total(double precio1, double precio2){
        double resultado;
        resultado = precio1+precio2;
        return resultado;
    }

}

