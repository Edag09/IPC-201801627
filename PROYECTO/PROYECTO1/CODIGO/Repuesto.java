package Org.EduardoAgustin.Clases;

public class Repuesto {
    private String nombreRepuesto;
    private double precioRepuesto;

    public Repuesto(String nombreRepuesto, double precioRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
        this.precioRepuesto = precioRepuesto;
    }

    public Repuesto() {
    }

    /**
     * @return the nombreRepuesto
     */
    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    /**
     * @param nombreRepuesto the nombreRepuesto to set
     */
    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    /**
     * @return the precioRepuesto
     */
    public double getPrecioRepuesto() {
        return precioRepuesto;
    }

    /**
     * @param precioRepuesto the precioRepuesto to set
     */
    public void setPrecioRepuesto(double precioRepuesto) {
        this.precioRepuesto = precioRepuesto;
    }
    
    
    
}
