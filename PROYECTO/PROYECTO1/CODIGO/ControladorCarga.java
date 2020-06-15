package Org.EduardoAgustin.Clases;

import javax.swing.JComboBox;

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
    
    public void datosTipo(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("tipo")) {
             for (int i = 0; i < tipo.length; i++) {
             if (tipo[i] != null) {
                 add.addItem(tipo[i].getNoombre());
             }
         }
         }
     }
    
    public String datosT(String nombre){
        for (int i = 0; i < tipo.length; i++) {
            if (tipo[i]!=null) {
                if (tipo[i].getNoombre().equalsIgnoreCase(nombre)) {
                    return tipo[i].getNoombre();
                }
            }else{
                break;
            }
        }
        return null;
    }
    
    public double valorAsegurado(double valor){
        for (int i = 0; i < tipo.length; i++) {
            if (tipo[i]!=null) {
                if (tipo[i].getValorAsegurado() == valor) {
                    return tipo[i].getValorAsegurado();
                }
            }else{
                break;
            }
        }
        return 0;    
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
    
    public void datosModelo(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("modelo")) {
             for (int i = 0; i < modelo.length; i++) {
             if (modelo[i] != null) {
                 add.addItem(modelo[i].getAnio());
             }
         }
         }
     }
   
    public int anio(int year){
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i] != null) {
                if (modelo[i].getAnio() == year) {
                    return modelo[i].getAnio();
                }
            }
        }
        return 0;
    }
    
    public double porcentaje(int anio){
        for (int i = 0; i < modelo.length; i++) {
            if (modelo[i] != null) {
                if (modelo[i].getAnio()== anio) {
                    return modelo[i].getPorcentaje();
                }
            }
        }
        return 0;
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
    
    public void datosMarca(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("marca")) {
             for (int i = 0; i < marca.length; i++) {
             if (marca[i] != null) {
                 add.addItem(marca[i].getNombreMarca());
             }
         }
         }
     }
   
    public String nombreMarca(String nombre){
        for (int i = 0; i < marca.length; i++) {
            if (marca[i] != null) {
                if (marca[i].getNombreMarca().equalsIgnoreCase(nombre)) {
                    return marca[i].getNombreMarca();
                }
            }
        }
        return null;
    }
    
    public double porcentajeMarca(String nombreM){
        for (int i = 0; i < marca.length; i++) {
            if (marca[i] != null) {
                if (marca[i].getNombreMarca()== nombreM) {
                    return marca[i].getAumentoPoliza();
                }
            }
        }
        return 0;
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
    
    public void datosUso(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("uso")) {
             for (int i = 0; i < uso.length; i++) {
             if (uso[i] != null) {
                 add.addItem(uso[i].getUsoVehiculo());
             }
         }
         }
     }
    
    public String nombreUso(String nombre){
        for (int i = 0; i < uso.length; i++) {
            if (uso[i] != null) {
                if (uso[i].getUsoVehiculo().equalsIgnoreCase(nombre)) {
                    return uso[i].getUsoVehiculo();
                }
            }
        }
        return null;
    }
    
    public double porcentajeUso(String nombreUso){
        for (int i = 0; i < uso.length; i++) {
            if (uso[i] != null) {
                if (uso[i].getUsoVehiculo()== nombreUso) {
                    return uso[i].getAumentoPolizauso();
                }
            }
        }
        return 0;
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
    
    public void datosLinea(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("linea")) {
             for (int i = 0; i < linea.length; i++) {
             if (linea[i] != null) {
                 add.addItem(linea[i].getNombreLinea());
             }
         }
         }
     }
    
    public String nombreLinea(String nombre){
        for (int i = 0; i < linea.length; i++) {
            if (linea[i] != null) {
                if (linea[i].getNombreLinea().equalsIgnoreCase(nombre)) {
                    return linea[i].getNombreLinea();
                }
            }
        }
        return null;
    }
    
    public double porcentajeLinea(String nombreLinea){
        for (int i = 0; i < linea.length; i++) {
            if (linea[i] != null) {
                if (linea[i].getNombreLinea()== nombreLinea) {
                    return linea[i].getPolizaAumentoLinea();
                }
            }
        }
        return 0;
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
    
    public void datosMecanica(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("mecanica")) {
             for (int i = 0; i < mecanica.length; i++) {
             if (mecanica[i] != null) {
                 add.addItem(mecanica[i].getNombreActividad());
             }
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
    
    public void datosRepuestos(JComboBox add,String nombre){
         if (nombre.equalsIgnoreCase("repuesto")) {
             for (int i = 0; i < repuestos.length; i++) {
             if (repuestos[i] != null) {
                 add.addItem(repuestos[i].getNombreRepuesto());
             }
         }
         }
     }
    
}
