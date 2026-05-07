/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rmimm
 */
import java.util.ArrayList;
import java.util.List;
public class TesteFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos", 5000, 2000));
        funcionarios.add(new Vendedor("Ana", 2000, 800));

        for (Funcionario f : funcionarios) {
            System.out.println("Salario: R$ " + f.calcularSalario());
        }
    }
}
