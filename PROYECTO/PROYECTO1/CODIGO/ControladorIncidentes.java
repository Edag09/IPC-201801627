package Org.EduardoAgustin.Clases;

public class ControladorIncidentes {
 public static DatosIncidentes incidentes[] = new DatosIncidentes[25];
 public static int cont =0;
 
    public void agregarIncidente(int correlativo, String servicio, String repuesto, String total){
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i] == null) {
                incidentes[i] = new DatosIncidentes(correlativo, servicio, repuesto,total);
                cont++;
                break;
            }
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < incidentes.length; i++) {
            if (incidentes[i] != null) {
                System.out.println("ID: "+incidentes[i].getId()+"\nServicio: "+incidentes[i].getServicio()+"\nRepuesto: "+incidentes[i].getRepuesto()
                +"\nTotal: "+incidentes[i].getTotal());
            }
        }
    }
}
