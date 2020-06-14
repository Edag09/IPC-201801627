package Org.EduardoAgustin.Clases;

public class LineaVehiculo {
    private String nombreLinea;
    private double polizaAumentoLinea;

    public LineaVehiculo() {
    }

    public LineaVehiculo(String nombreLinea, double polizaAumentoLinea) {
        this.nombreLinea = nombreLinea;
        this.polizaAumentoLinea = polizaAumentoLinea;
    }

    /**
     * @return the nombreLinea
     */
    public String getNombreLinea() {
        return nombreLinea;
    }

    /**
     * @param nombreLinea the nombreLinea to set
     */
    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    /**
     * @return the polizaAumentoLinea
     */
    public double getPolizaAumentoLinea() {
        return polizaAumentoLinea;
    }

    /**
     * @param polizaAumentoLinea the polizaAumentoLinea to set
     */
    public void setPolizaAumentoLinea(double polizaAumentoLinea) {
        this.polizaAumentoLinea = polizaAumentoLinea;
    }
    
    
}
