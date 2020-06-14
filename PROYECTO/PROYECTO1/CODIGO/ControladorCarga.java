package Org.EduardoAgustin.Clases;

public class ControladorCarga {
    public static TipoVehiculo tipo[] = new TipoVehiculo[50];
    public static ModeloVehiculo modelo[] = new ModeloVehiculo[50];
    public static MarcaVehiculo marca[] = new MarcaVehiculo[50];
    public static UsoVehiculo uso[] = new UsoVehiculo[50];
    public static LineaVehiculo linea[] = new LineaVehiculo[50];
    public static Mecanica mecanica[]  = new Mecanica[50];
    public static Repuesto repuestos[] = new Repuesto[50];
    
    
    public void ingresarTipo(String nombre, double seguroCarro){
        for (int i = 0; i < tipo.length; i++) {
            if (tipo[i]==null) {
                tipo[i]= new TipoVehiculo(nombre, seguroCarro);
                break;
            }
        }
    }
    
    public void mostrarTipo(){
        for (int i = 0; i < tipo.length; i++) {
            if (tipo[i]!=null) {
                System.out.println("Tipo :"+tipo[i].getNoombre()+"  Valor Asegurado"+tipo[i].getValorAsegurado());
            }
        }
    }
    
    
    
    public void ingresarModelo(int anio,double pors){
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i]==null) {
                modelo[i] = new ModeloVehiculo(anio, pors);
                break;
            }
        }
    }
    
    public void mostrarModelo(){
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i]!= null) {
                System.out.println("Modelo: "+modelo[i].getAnio()+"  Porcentaje: "+modelo[i].getPorcentaje());
            }
        }
    }
   
    
    
    public void ingresarMarca(String nomMarca, double polizaMarca){
        for (int i = 0; i < marca.length; i++) {
            if (marca[i]==null) {
                marca[i]=new MarcaVehiculo(nomMarca, polizaMarca);
                break;
            }
        }
    }
    
    public void mostrarMarca(){
        for (int i = 0; i < marca.length; i++) {
            if (marca[i]!= null) {
                System.out.println("Marca: "+marca[i].getNombreMarca()+"  Poliza: "+marca[i].getAumentoPoliza());
            }
        }
    } 
    
    
    
    
    public void ingresarUso(String tipodeUso, double polizaUso){
        for (int i = 0; i < uso.length; i++) {
                if (uso[i] == null) {
                uso[i] = new UsoVehiculo(tipodeUso, polizaUso);
                break;
            }
        }
    }
    
    
    public void mostrarUso(){
        for (int i = 0; i < uso.length; i++) {
            if (uso[i]!=null) {
                System.out.println("Uso: "+uso[i].getUsoVehiculo()+"  Poliza: "+uso[i].getAumentoPolizauso());
            }
        }
    } 
    
    
    
    
    public void ingresarLinea(String lineaNombre, double polizaLinea){
        for (int i = 0; i < linea.length; i++) {
            if (linea[i] == null) {
                linea[i] = new LineaVehiculo(lineaNombre, polizaLinea);
                break;
            }
        }
    }
    
     public void mostrarLinea(){
        for (int i = 0; i < linea.length; i++) {
            if (linea[i]!=null) {
                System.out.println("Linea: "+linea[i].getNombreLinea()+"  Poliza: "+linea[i].getPolizaAumentoLinea());
            }
        }
    } 
    
    
     
     
     
     
    
    public void ingresarMecanica(String nombreTaller, double precioAplicado){
        for (int i = 0; i < mecanica.length; i++) {
            if (mecanica[i] == null) {
                mecanica[i] = new Mecanica(nombreTaller, precioAplicado);
                break;
            }
        }
    }
    
    public void mostrarMecanica(){
        for (int i = 0; i < mecanica.length; i++) {
            if (mecanica[i]!=null) {
                System.out.println("Mecanica: "+mecanica[i].getNombreActividad()+"  Precio: "+mecanica[i].getPrecio());
            }
        }
    } 
    
    
    
    
    
    
    public void ingresarRepuesto(String repuesto, double precio){
        for (int i = 0; i < repuestos.length; i++) {
            if (repuestos[i] == null) {
                repuestos[i] = new Repuesto(repuesto, precio);
                break;
            }
        }
    }
    
    public void mostrarRepuesto(){
        for (int i = 0; i < repuestos.length; i++) {
            if (repuestos[i]!=null) {
                System.out.println("Repuesto: "+repuestos[i].getNombreRepuesto()+"  Precio: "+repuestos[i].getPrecioRepuesto());
            }
        }
    } 
}
