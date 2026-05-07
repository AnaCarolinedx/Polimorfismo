/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeanimal;

/**
 *
 * @author Admin
 */
abstract class Animal {
    abstract void fazerSom();
    
    void respirar(){
        System.out.println("Respirando...");
    }
}

class Cachorro extends Animal {
    void fazerSom(){
        System.out.println("Au au");
    }
}