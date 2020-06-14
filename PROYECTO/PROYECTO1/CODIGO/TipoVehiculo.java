package Org.EduardoAgustin.Clases;

public class TipoVehiculo {
    private String noombre;
    private double valorAsegurado;

    public TipoVehiculo(String noombre, double valorAsegurado) {
        this.noombre = noombre;
        this.valorAsegurado = valorAsegurado;
    }

    public TipoVehiculo() {
    }
    
    public String getNoombre() {
        return noombre;
    }

    public void setNoombre(String noombre) {
        this.noombre = noombre;
    }

    public double getValorAsegurado() {
        return valorAsegurado;
    }

    public void setValorAsegurado(double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }
}
