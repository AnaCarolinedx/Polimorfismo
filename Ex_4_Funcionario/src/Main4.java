/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public class Main4 {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Vendedor();

        System.out.println("Salário Gerente: " + f1.calcularSalario());
        System.out.println("Salário Vendedor: " + f2.calcularSalario());
    }
}
