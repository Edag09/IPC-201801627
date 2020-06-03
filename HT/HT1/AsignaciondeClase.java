
package Otros;

import java.util.Scanner;

public class AsignaciondeClase {

        //Por fines practicos utilice una variable aleatoria para generar si la clase estaba llena o no
        //por lo tanto en su mayotia tirara que esta asiganado por lo tanto para ver si funcionaba utilice 
        //una variable num = 15 para ver si se salia del ciclo y en efecto si funciono
        public static String nombre;
        public static int carne,opc;
        public static Scanner leer = new Scanner(System.in);
        public static int numero = (int)(Math.random()*5+1);
   public static void main(String[]args){
   asignacion();
   }
    public static void asignacion(){
        System.out.println("Bienvenido al portal de Ingenieria \n");
        System.out.println("Ingresa tu nombre: ");
        nombre = leer.next();
        System.out.println("Ingresa tu Carne: ");
        carne = leer.nextInt();
        System.out.println("\n Has iniciado sesion \n\n");
        
        menu();
    }
    
    public static void menu(){
        System.out.println("A que seccion deseas asignarte? \n");
        System.out.println("1. Seccion A \n2. Seccion B \n3. Solicitar Nueva Seccion");
        opc = leer.nextInt();
        if (opc == 1) {
        seccionA();
        }else if(opc ==2){
         seccionB();
        }else if(opc == 3){
            System.out.println("Se ha enviado una solicitud para otra seccion");
        }
    }
    
    public static void seccionA(){
        System.out.println("Cupo numero "+numero);
    if (numero == 5) {
            System.out.println("La seccion A esta llena, favor de pasar a siguiente seccion");
            
        }else{
            System.out.println("Asignad@");
        }
    }
    
    public static void seccionB(){
    
        System.out.println("Cupo numero "+numero);
        if (numero == 5) {
            System.out.println("La seccion B esta llena, favor de ir a otra seccion");
            
        }else{
            System.out.println("Asignad@");
        }
    }
    
    
}
