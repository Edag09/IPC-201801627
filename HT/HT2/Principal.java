package HojasDeTrabajo;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Mis caballos son: \n");
        Caballo caballitoMascota = new Caballo("Andrew", "Americano", 4);
        caballitoMascota.avanzar();
        caballitoMascota.frenar();
        System.out.println("------------------------------------------");
        Caballo caballoModelo = new Caballo("Josue", "Britanico", 3);
        caballoModelo.avanzar();
        caballoModelo.frenar();
        System.out.println("\n");
        
        System.out.println("Mis Carros son: \n");
        Carro convencional = new Carro("Toyota", "sedan", 2006);
        convencional.avanzar();
        convencional.frenar();
        System.out.println("------------------------------------------");
        Carro carrerasClandestinas = new Carro("Porche", "Deportivo", 2018);
        carrerasClandestinas.avanzar();
        carrerasClandestinas.frenar();
        System.out.println("\n");
        
        System.out.println("Mis Aviones son: \n");
        Avion carga = new Avion("Boeing 737", "Carga", 900);
        carga.avanzar();
        carga.frenar();
        System.out.println("------------------------------------------");
        Avion Jet = new Avion("Turboprop", "F50",1);
        Jet.avanzar();
        Jet.frenar();
        
    }
}
