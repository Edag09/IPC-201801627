package HojasDeTrabajo;


public class Carro implements Transporte {
    private String marca;
    private String tipo;
    private int modelo;

    public Carro(String marca, String tipo, int modelo) {
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
    }
    
    @Override
    public void avanzar() {
    System.out.println("AVANCE-CARRO-"+marca+"-MODELO-"+modelo+"-TIPO-"+tipo);
    }

    @Override
    public void frenar() {
     System.out.println("FRENE-CARRO-"+marca+"-MODELO-"+modelo+"-TIPO-"+tipo);
    }
    
}
