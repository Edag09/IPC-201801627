package Org.EduardoAgustin.Clases;

public class DatosPersonas {
    
    private String nombre,apellido,tipoVehiculo,usoVehiculo,marca,dpi;
    private int telefono;
    private double valvehiculo;

    public DatosPersonas() {
    }

    public DatosPersonas(String nombre, String apellido, String tipoVehiculo, String usoVehiculo, String marca, String dpi, int telefono, double valvehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoVehiculo = tipoVehiculo;
        this.usoVehiculo = usoVehiculo;
        this.marca = marca;
        this.dpi = dpi;
        this.telefono = telefono;
        this.valvehiculo = valvehiculo;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @param tipoVehiculo the tipoVehiculo to set
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the dpi
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * @param dpi the dpi to set
     */
    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the valvehiculo
     */
    public double getValvehiculo() {
        return valvehiculo;
    }

    /**
     * @param valvehiculo the valvehiculo to set
     */
    public void setValvehiculo(double valvehiculo) {
        this.valvehiculo = valvehiculo;
    }
    
    public String imprimir(){
        return this.getNombre();
    }
    
}
