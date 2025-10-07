package view.escolamusical;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiz.gbrito
 */
public class InstrumentoMusical {
    protected String nome;
    protected String material;
    
    public InstrumentoMusical (String nome, String material){
        this.nome = nome;
        this.material = material;
    }
    
    public abstract void tocar();
    
    public void afinar(){
        System.out.println("Afinando "+nome+"...");
    }
    
    public void show(){
        System.out.println("Instrumento: "+nome);
        System.out.println("Seu material: "+material);
}
}
