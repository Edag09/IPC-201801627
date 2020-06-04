package Org.EduardoAgustin.Menu;

import java.util.Scanner;

public class MenuP {
    MenuTablero tablero = new MenuTablero();
    public int opc;
    public boolean status ;
    public Scanner read = new Scanner(System.in);
    public MenuP() {
        this.status = false;
        this.opc =0;
    }
    
    public void IniciarMenu(){
        do{
        System.out.println("Selecciona una opcion por favor");
        System.out.println("--->1. Crear Tablero");
        System.out.println("--->2. Reporte Completo");
        System.out.println("--->3. Reporte Victoria");
        System.out.println("--->4. Salir");
        opc = read.nextInt();
            
            switch(opc){
            case 1:
                CrearTablero();
                break;
            case 2:
                ReporteCompleto();
                break;
            case 3:
                ReporteVictorias();
                break;
            case 4:
                Salir();
                break;
            }
        }while(!status);
    }
    
    public void CrearTablero(){
    tablero.MTablero();
    }
    
    public void ReporteCompleto(){
    
    }
    
    public void ReporteVictorias(){
    
    }
    
    public void Salir(){
        System.out.println("Gracias por Jugar");
        System.exit(0);
    }
    
}
