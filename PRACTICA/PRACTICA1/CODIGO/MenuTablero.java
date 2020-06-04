package Org.EduardoAgustin.Menu;

import java.util.Scanner;

public class MenuTablero {
    public int opc;
    public boolean status ;
    String Tablero[][] = new String[11][11];
    public Scanner readoption = new Scanner(System.in);
    
    public MenuTablero() {
        this.opc = 0;
    }
    
    public void MTablero(){
        do{
        System.out.println("Selecciona una opcion por favor");
        System.out.println("--->1. Ingresar Barcos");
        System.out.println("--->2. Cambiar Cantidad de Movimientos");
        System.out.println("--->3. Iniciar Juegos");
        System.out.println("--->4. Ver Tablero");
        System.out.println("--->5. Reiniciar Tablero");
        System.out.println("--->6. Regresar al Menu");
        opc = readoption.nextInt();
            
            switch(opc){
            case 1:
                IniciarTablero();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Regreso();
                break;
            }
        }while(!status);
    }
    
    
   public void IniciarTablero(){
       for (int i = 0; i < Tablero.length; i++) {
           for (int j = 0; j < Tablero.length; j++) {
               Tablero[i][j]=" ";
               Tablero[i][0]=""+i+"";
               Tablero[0][j]=""+j+"";
               System.out.print("["+Tablero[i][j]+"]");
           }
           System.out.println("");
       }
       System.out.println("Que barco deseas ingresar?");
       System.out.println("1. Portaaviones");
       System.out.println("2. Submarino");
       System.out.println("3. Destructur");
       System.out.println("4. Fragata");
       System.out.println("5. EASTER EGG");
   }
   
   public void SplitPosicion(){
   
   }
   
   
   public void Regreso(){
       MenuP principal = new MenuP();
       principal.IniciarMenu();
   }
}
