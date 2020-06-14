package Org.EduardoAgustin.Clases;


public class ModeloVehiculo {
    private int anio;
    private double porcentaje;

    public ModeloVehiculo(int anio, double porcentaje) {
        this.anio = anio;
        this.porcentaje = porcentaje;
    }

    public ModeloVehiculo() {
    }  
    
    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the porcentaje
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
