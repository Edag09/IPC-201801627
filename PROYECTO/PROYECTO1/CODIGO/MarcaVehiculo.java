
package Org.EduardoAgustin.Clases;


public class MarcaVehiculo {
    private String nombreMarca;
    private double aumentoPoliza;

    public MarcaVehiculo(String nombreMarca, double aumentoPoliza) {
        this.nombreMarca = nombreMarca;
        this.aumentoPoliza = aumentoPoliza;
    }

    public MarcaVehiculo() {
    }

    /**
     * @return the nombreMarca
     */
    public String getNombreMarca() {
        return nombreMarca;
    }

    /**
     * @param nombreMarca the nombreMarca to set
     */
    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    /**
     * @return the aumentoPoliza
     */
    public double getAumentoPoliza() {
        return aumentoPoliza;
    }

    /**
     * @param aumentoPoliza the aumentoPoliza to set
     */
    public void setAumentoPoliza(double aumentoPoliza) {
        this.aumentoPoliza = aumentoPoliza;
    }
    
    
}
