package Org.EduardoAgustin.Clases;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ControladorDatosdeCotizacion {
    public static DatosCotizacion cotizado[] = new DatosCotizacion[25];

    public void guardadCotizacion(String prima, String deducible, String posPrima, String posDedu, String valReal, String valVehiculo, String dpi){
        for (int i = 0; i < cotizado.length; i++) {
            if (cotizado[i]==null) {
                cotizado[i] = new DatosCotizacion(prima, deducible, posPrima, posDedu, valReal, valVehiculo, dpi);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < cotizado.length; i++) {
            if (cotizado[i] != null) {
                JOptionPane.showMessageDialog(null, "Prima: "+cotizado[i].getCostoPrimal()+"\nDeducible: "+cotizado[i].getDeducible()+"\nPosible Costo Prima: "+cotizado[i].getPosibleCostoPrima()
                +"\nPosible Deducible: "+cotizado[i].getPosibleDeducible()+"\nValore Real: "+cotizado[i].getValorReal()+"\nValor Vehiculo: "+cotizado[i].getValVehiculo()+"\nDPI: "+cotizado[i].getDpi());
            }
        }
    }
    
    public String Prima(String dpi){
        for (int i = 0; i < cotizado.length; i++) {
            if (cotizado[i] != null) {
                if (cotizado[i].getDpi().equalsIgnoreCase(dpi)) {
                    return cotizado[i].getCostoPrimal();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public String Deducible(String dpi){
        for (int i = 0; i < cotizado.length; i++) {
            if (cotizado[i] != null) {
                if (cotizado[i].getDpi().equalsIgnoreCase(dpi)) {
                    return cotizado[i].getDeducible();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public String ValorReal(String dpi){
        for (int i = 0; i < cotizado.length; i++) {
            if (cotizado[i] != null) {
                if (cotizado[i].getDpi().equalsIgnoreCase(dpi)) {
                    return cotizado[i].getValorReal();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    
    
    
    
    public double PTR(double porsMarca, double porsLinea,double porsUso){
        double PTR;
        PTR = (porsMarca+porsLinea+porsUso);
        return PTR;
    }
    
    public double PrimaTotal(double valVehiculo,double ptr){
        double pt;
            pt = valVehiculo*(0.1+ptr);
        return pt;
    }
    
    public double CostoPrima(double pt){
        double cp;
        cp = (pt/12);
        return cp;
    }
    
    public double CostoDeducible(double valVehiculo){
        double cd;
        cd = (0.07*valVehiculo);
        return cd;
    }
    
    public double valorReal(double valVehiculo,double porsModelo){
        double vr;
        vr = (valVehiculo - (porsModelo*valVehiculo));
        return vr;
    }
    
    public double MasDeducible(double dedu){
        double masdedu;
        masdedu = (dedu+0.10);
        return masdedu;
    }
    
    public double MasdeduMenosPri(double pri){
        double masdedu;
        masdedu = (pri - 0.03);
        return masdedu;
    }
    
}
