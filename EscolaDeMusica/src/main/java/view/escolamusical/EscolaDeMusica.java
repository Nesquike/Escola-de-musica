/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view.escolamusical;

/**
 *
 * @author luiz.gbrito
 */
public class EscolaDeMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstrumentoMusical[] banda = new InstrumentoMusical[4];
        
        banda[0] = new ViolaoExercicio("Violão", "Madeira", 6);
        banda[1] = new SaxofoneExercicio("Saxofone", "Latão", "Alto");
        banda[2] = new BateriaExercicio("Bateria Acustica", "Madeira, metal e peles", 7);
        banda[3] = new PianoExercicio ("Piano de Cauda", "Madeira", 88);
        
        EscolaDeMusica escola = new EscolaDeMusica();
        
        escola.apresentar(banda);
        
    }
    
    public void apresentar(InstrumentoMusical[] banda){
        System.out.println("=== Orquesta começando ===\n");
        
        System.out.println("---Afinação dos instrumentos---");
        for (InstrumentoMusical instrumento : banda){
            instrumento.afinar();
        
        }
        System.out.println();
        
        System.out.println("-- Instrumentos começaram a tocar --");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }
        System.out.println();
        
        System.out.println("-- Mostrando informações dos instrumentos --");
        for (int i = 0; i < banda.length; i++) {
            System.out.println("Instrumento musical " + (i + 1) + ": ");
            banda[i].show();
            System.out.println();
        }
    }        
    
}
