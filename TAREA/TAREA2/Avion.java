package Tarea2;

public class Avion extends Transporte {
    private String marcaA;
    private String modelo;
    private int personas;

    public Avion(String marcaA, String modelo, int personas) {
        this.marcaA = marcaA;
        this.modelo = modelo;
        this.personas = personas;
    }
    
    
    @Override
    public void avanzar() {
    System.out.println("AVANCE-AVION-PASAJEROS-"+personas+"-MARCA-"+marcaA +"-MODELO-"+modelo);
    }

    @Override
    public void frenar() {
    System.out.println("FRENE-AVION-PASAJEROS-"+personas+"-MARCA-"+marcaA +"-MODELO-"+modelo);
    }


}
