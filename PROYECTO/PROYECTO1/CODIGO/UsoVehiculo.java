
package Org.EduardoAgustin.Clases;

public class UsoVehiculo {
    private String usoVehiculo;
    private double aumentoPolizauso;

   

    public UsoVehiculo() {
    }

    public UsoVehiculo(String usoVehiculo, double aumentoPolizauso) {
        this.usoVehiculo = usoVehiculo;
        this.aumentoPolizauso = aumentoPolizauso;
    }

    /**
     * @return the usoVehiculo
     */
    public String getUsoVehiculo() {
        return usoVehiculo;
    }

    /**
     * @param usoVehiculo the usoVehiculo to set
     */
    public void setUsoVehiculo(String usoVehiculo) {
        this.usoVehiculo = usoVehiculo;
    }

    /**
     * @return the aumentoPolizauso
     */
    public double getAumentoPolizauso() {
        return aumentoPolizauso;
    }

    /**
     * @param aumentoPolizauso the aumentoPolizauso to set
     */
    public void setAumentoPolizauso(double aumentoPolizauso) {
        this.aumentoPolizauso = aumentoPolizauso;
    }
    

    
    
    
    
}
