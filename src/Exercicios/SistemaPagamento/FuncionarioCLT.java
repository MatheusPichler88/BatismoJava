package Exercicios.SistemaPagamento;

public class FuncionarioCLT extends Funcionario implements Pagavel{

    public FuncionarioCLT(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase();
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Salário: "+getSalarioBase());
    }
    @Override
    public void exibirDados(boolean comCpf) {
        exibirDados();
    }
}
