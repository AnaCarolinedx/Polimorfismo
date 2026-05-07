/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rmimm
 */
public class Vendedor extends Funcionario {

    private double salarioBase;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}
