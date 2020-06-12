/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author Eduardo Agustin
 */
public class Carro extends Transporte{
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
