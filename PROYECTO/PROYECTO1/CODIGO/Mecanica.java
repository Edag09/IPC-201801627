package Org.EduardoAgustin.Clases;

public class Mecanica {
    private String nombreActividad;
    private double precio;

    public Mecanica() {
    }

    public Mecanica(String nombreActividad, double precio) {
        this.nombreActividad = nombreActividad;
        this.precio = precio;
    }

    /**
     * @return the nombreActividad
     */
    public String getNombreActividad() {
        return nombreActividad;
    }

    /**
     * @param nombreActividad the nombreActividad to set
     */
    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
