/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.escolamusical;

/**
 *
 * @author luiz.gbrito
 */
public class PianoExercicio extends InstrumentoMusical {
    private int numeroTeclas;
    
    public PianoExercicio(String nome, String material, int numeroTeclas){
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando uma bela melodia no " +nome+ " com suas "+getNumeroTeclas()+" teclas");
        System.out.println("Executando uma sonata classica");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das cordas das "+getNumeroTeclas()+" teclas");
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Numero de teclas: "+getNumeroTeclas());
    }

    /**
     * @return the numeroTeclas
     */
    public int getNumeroTeclas() {
        return numeroTeclas;
    }
}
