/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public class Main5 {

    public static void tocarInstrumento(InstrumentoMusical i) {
        i.tocar();
    }

    public static void main(String[] args) {
        InstrumentoMusical i1 = new Guitarra();
        InstrumentoMusical i2 = new Piano();

        tocarInstrumento(i1);
        tocarInstrumento(i2);
    }
}