
package Org.EduardoAgustin.Clases;


public class DatosCotizacion {
    private String costoPrimal;
    private String deducible;
    private String posibleCostoPrima;
    private String posibleDeducible;
    private String valorReal;
    private String valVehiculo;
    private String dpi;

    public DatosCotizacion(String costoPrimal, String deducible, String posibleCostoPrima, String posibleDeducible, String valorReal, String valVehiculo, String dpi) {
        this.costoPrimal = costoPrimal;
        this.deducible = deducible;
        this.posibleCostoPrima = posibleCostoPrima;
        this.posibleDeducible = posibleDeducible;
        this.valorReal = valorReal;
        this.valVehiculo = valVehiculo;
        this.dpi = dpi;
    }

    /**
     * @return the costoPrimal
     */
    public String getCostoPrimal() {
        return costoPrimal;
    }

    /**
     * @param costoPrimal the costoPrimal to set
     */
    public void setCostoPrimal(String costoPrimal) {
        this.costoPrimal = costoPrimal;
    }

    /**
     * @return the deducible
     */
    public String getDeducible() {
        return deducible;
    }

    /**
     * @param deducible the deducible to set
     */
    public void setDeducible(String deducible) {
        this.deducible = deducible;
    }

    /**
     * @return the posibleCostoPrima
     */
    public String getPosibleCostoPrima() {
        return posibleCostoPrima;
    }

    /**
     * @param posibleCostoPrima the posibleCostoPrima to set
     */
    public void setPosibleCostoPrima(String posibleCostoPrima) {
        this.posibleCostoPrima = posibleCostoPrima;
    }

    /**
     * @return the posibleDeducible
     */
    public String getPosibleDeducible() {
        return posibleDeducible;
    }

    /**
     * @param posibleDeducible the posibleDeducible to set
     */
    public void setPosibleDeducible(String posibleDeducible) {
        this.posibleDeducible = posibleDeducible;
    }

    /**
     * @return the valorReal
     */
    public String getValorReal() {
        return valorReal;
    }

    /**
     * @param valorReal the valorReal to set
     */
    public void setValorReal(String valorReal) {
        this.valorReal = valorReal;
    }

    /**
     * @return the valVehiculo
     */
    public String getValVehiculo() {
        return valVehiculo;
    }

    /**
     * @param valVehiculo the valVehiculo to set
     */
    public void setValVehiculo(String valVehiculo) {
        this.valVehiculo = valVehiculo;
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
    
    
}
