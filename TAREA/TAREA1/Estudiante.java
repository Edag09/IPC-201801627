
package Org.EduardoAgustin;

public class Estudiante {
    String[] nombreEstudiantesA;
    String[] nombreEstudiantesB;

    public Estudiante() {
        this.nombreEstudiantesA = new String[5];
        this.nombreEstudiantesB = new String[5];
    }
    
    public void llenar(){
    this.nombreEstudiantesA[0]="Andrea Martinez";
    this.nombreEstudiantesA[1]="Alejandro Mazariegos";
    this.nombreEstudiantesA[2]="Veronica Perez";
    this.nombreEstudiantesA[3]="Alejandra Alvarado";
      this.nombreEstudiantesB[4]="Andrea Callejas";
    
    }
    
    public void mostrar(){
        for (int i = 0; i < nombreEstudiantesA.length; i++) {
            System.out.println(nombreEstudiantesA[i]);
        }
        System.out.println("");
    }
    
    public void llenarB(){
    this.nombreEstudiantesB[0]="Alex Ramirez";
    this.nombreEstudiantesB[1]="Rogelio Ramirez";
    this.nombreEstudiantesB[2]="Marcela Palma";
    this.nombreEstudiantesB[3]="Karen Ovando";
  
    }
    
    public void mostrarb(){
        for (int i = 0; i < nombreEstudiantesB.length; i++) {
            System.out.println(nombreEstudiantesB[i]);
        }
    }

    
    
    
}
