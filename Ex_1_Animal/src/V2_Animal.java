/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
interface V2_Animal {
    void fazerSom();
}

class Cachorro implements V2_Animal {
    public void fazerSom() {
        System.out.println("Cachorro: Au au!");
    }
}

class Gato implements V2_Animal {
    public void fazerSom() {
        System.out.println("Gato: Miau!");
    }
}
