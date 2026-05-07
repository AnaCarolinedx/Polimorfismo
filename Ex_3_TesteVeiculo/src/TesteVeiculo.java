/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public class TesteVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        fazerVeiculoMover(v1);
        fazerVeiculoMover(v2);
    }

    public static void fazerVeiculoMover(Veiculo v) {
        v.mover();
    }
}