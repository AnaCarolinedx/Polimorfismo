/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
abstract class Funcionario {
    public abstract double calcularSalario();
}

class Gerente extends Funcionario {
    public double calcularSalario() {
        return 5000;
    }
}

class Vendedor extends Funcionario {
    public double calcularSalario() {
        return 2000 + 500;
    }
}
