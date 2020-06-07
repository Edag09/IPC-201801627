package Org.EduardoAgustin;

import java.util.Scanner;

public class Menu {
    
    Scanner leerDatos;
    Estudiante estudiantes;
    public int opc;
    private String nombre;
    private int carne;

    public Menu() {
        this.leerDatos = new Scanner(System.in);
        this.estudiantes = new Estudiante();
    }
    
    public void iniciarMenu(){
        System.out.println("Bienvenido\n");
        System.out.println("Ingresa tu nombre:");
        nombre =leerDatos.next();
        System.out.println("Ingresa tu Carne");
        carne = leerDatos.nextInt();
        System.out.println(" ");
        menuAsignacion();
        
    }
    
    public void menuAsignacion(){
        do{
        System.out.println("A que seccion deseas ser Asignado?\n1. Seccion A\n2. Seccion B");
        opc = leerDatos.nextInt();
        estudiantes.llenar();
        estudiantes.llenarB();
            if (opc == 1) {
                 System.out.println("Esta seccion ya esta llena");
               System.out.println("Intenta con la siguiente Seccion");
                
            }else{
                estudiantes.nombreEstudiantesA[4]=nombre;
                System.out.println("Asignado");
                
            }
            }while(opc!=2);
            mostrar();
            
    }
    
    public void mostrar(){
        System.out.println("Deseas ver las asignaciones?\n1. Si\n2. No");
        opc = leerDatos.nextInt();
        if (opc ==1) {
            System.out.println("Seccion A");
            estudiantes.mostrar();
            System.out.println("Seccion B");
            estudiantes.mostrarb();
        }else{
            System.exit(0);
        }
    }
    

}
