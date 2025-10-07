/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.escolamusical;

/**
 *
 * @author luiz.gbrito
 */
public class SaxofoneExercicio extends InstrumentoMusical {
    private String tipo;
    
    public SaxofoneExercicio(String nome, String material, String tipo){
        super(nome, material);
        this.tipo = tipo;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando jazz suave no "+super.getnome()+ " " +getTipo()+"...");
        System.out.println("Melodia do saxofone... ");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando embocadura e chaves do saxofone");
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Tipo: ");
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }
}
