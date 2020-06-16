package Org.EduardoAgustin.Clases;

public class DatosIncidentes {
    private int id;
    private String servicio;
    private String repuesto;
    private String total;

    public DatosIncidentes(int id, String servicio, String repuesto, String total) {
        this.id = id;
        this.servicio = servicio;
        this.repuesto = repuesto;
        this.total = total;
    }
        
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the repuesto
     */
    public String getRepuesto() {
        return repuesto;
    }

    /**
     * @param repuesto the repuesto to set
     */
    public void setRepuesto(String repuesto) {
        this.repuesto = repuesto;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
