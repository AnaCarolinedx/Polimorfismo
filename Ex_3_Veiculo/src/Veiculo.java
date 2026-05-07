/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
abstract class Veiculo {
    public abstract void mover();
}

class Carro extends Veiculo {
    public void mover() {
        System.out.println("Carro está andando");
    }
}

class Bicicleta extends Veiculo {
    public void mover() {
        System.out.println("Bicicleta está pedalando");
    }
}
