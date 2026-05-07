/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public class TesteMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InstrumentoMusical i1 = new Guitarra();
        InstrumentoMusical i2 = new Piano();

        tocarInstrumento(i1);
        tocarInstrumento(i2);
    }

    // Método separado (fora do main)
    public static void tocarInstrumento(InstrumentoMusical instrumento) {
        instrumento.tocar();
    }
}
