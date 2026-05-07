/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
import java.util.ArrayList;
import java.util.List;
public class TesteForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(3));
        formas.add(new Retangulo(4, 5));
        formas.add(new Circulo(2.5));

        for (Forma f : formas) {
            System.out.println("Area: " + f.calcularArea());
        }
    }
}
