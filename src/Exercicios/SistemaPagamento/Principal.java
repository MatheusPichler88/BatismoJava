package Exercicios.SistemaPagamento;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario;

        System.out.println("O funcionario é CLT ou PJ?");
        String tipoFuncionario = sc.nextLine();

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        if(tipoFuncionario.equalsIgnoreCase("CLT")){
            System.out.println("Salário base: ");
            double salarioBase = sc.nextDouble();
            funcionario = new FuncionarioCLT(nome, cpf, salarioBase);

        } else if (tipoFuncionario.equalsIgnoreCase("PJ")) {
            System.out.println("Número de projeto: ");
            int numeroDeProjetos = sc.nextInt();
        funcionario = new FuncionarioPJ(nome, cpf, 0, numeroDeProjetos);
        }
        else{
            System.out.println("Tipo inválido");
            return;
        }
        System.out.println("\n--- Dados do Funcionário ---");
        funcionario.exibirDados(true);
        System.out.println("Pagamento: R$ "+funcionario.calcularPagamento());
    }
}
