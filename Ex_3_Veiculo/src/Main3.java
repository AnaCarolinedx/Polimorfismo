/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public class Main3 {

    public static void moverVeiculo(Veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {

        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        moverVeiculo(v1);
        moverVeiculo(v2);
    }
}
