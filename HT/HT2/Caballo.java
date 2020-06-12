
package HojasDeTrabajo;


public class Caballo implements Transporte {
    private String nombre;
    private String raza;
    private int edad;

    public Caballo(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    @Override
    public void avanzar() {
      System.out.println("AVANZA-CABALLO-"+nombre+"-RAZA-"+raza+"-EDAD-"+edad);
    }

    @Override
    public void frenar() {
      System.out.println("FRENE-CABALLO-"+nombre+"-RAZA-"+raza+"-EDAD-"+edad);
    }


    
}
