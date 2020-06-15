package Org.EduardoAgustin.Clases;

import java.text.DecimalFormat;

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
    
    public double MenDeducible(double dedu){
        double masdedu;
        masdedu = (dedu - 0.10);
        return masdedu;
    }
    
    public double MenDeduMaspri(double pri){
        double masdedu;
        masdedu = (pri + 0.03);
        return masdedu;
    }
}
