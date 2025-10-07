/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.escolamusical;

/**
 *
 * @author luiz.gbrito
 */
public class BateriaExercicio extends InstrumentoMusical {
    private int numeroPecas;
    
    public BateriaExercicio(String nome, String material, int numeroPecas){
        super(nome, material);
        this.numeroPecas = numeroPecas;
        
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando violentamente whiplash "+super.getnome()+
        " depois de ter montado as "+getNumeroPecas()+" peças da bateria");
        System.out.println("Tocando percussao bacana...");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando tensão das peles ");
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Numero de peças: "+getNumeroPecas());
    }

    /**
     * @return the numeroPecas
     */
    public int getNumeroPecas() {
        return numeroPecas;
    }
    
    
}
