/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    // método abstrato
    public abstract double calcularSalario();
}
