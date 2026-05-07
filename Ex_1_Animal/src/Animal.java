/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
abstract class Animal {
    public abstract void fazerSom();
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro: Au au!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato: Miau!");
    }
}
