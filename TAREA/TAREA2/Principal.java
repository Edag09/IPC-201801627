
package Tarea2;


public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Mis caballos son: \n");
        Caballo caballito = new Caballo("Spirit", "PuraSangre", 5);
        caballito.avanzar();
        caballito.frenar();
        System.out.println("------------------------------------------");
        Caballo caballodeRaza = new Caballo("Shelli", "Español", 2);
        caballodeRaza.avanzar();
        caballodeRaza.frenar();
        System.out.println("\n");
        
        System.out.println("Mis Carros son: \n");
        Carro normal = new Carro("Mazda", "sedan", 2016);
        normal.avanzar();
        normal.frenar();
        System.out.println("------------------------------------------");
        Carro deportivo = new Carro("Corvet", "Deportivo", 2020);
        deportivo.avanzar();
        deportivo.frenar();
        System.out.println("\n");
        
        System.out.println("Mis Aviones son: \n");
        Avion avionComercial = new Avion("A320", "Comercial", 500);
        avionComercial.avanzar();
        avionComercial.frenar();
        System.out.println("------------------------------------------");
        Avion privado = new Avion("Falcon900LX", "G650",3);
        privado.avanzar();
        privado.frenar();
        
        
    }
    
}
