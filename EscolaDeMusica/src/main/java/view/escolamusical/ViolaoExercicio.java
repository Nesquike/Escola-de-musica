/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.escolamusical;

/**
 *
 * @author luiz.gbrito
 */
public class ViolaoExercicio extends InstrumentoMusical {
    private int numeroCordas;
    
    public ViolaoExercicio(String nome, String material, int numeroCordas){
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando suavemente o "+super.getnome()+" de "+numeroCordas+" cordas");
        System.out.println("Dedilhando uma melodia romantica no violao");
    
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das "+numeroCordas+" cordas");
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Numero de cordas: "+numeroCordas);
    }
}
