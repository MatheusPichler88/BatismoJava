package Exercicios.SistemaPagamento;

public class FuncionarioPJ extends Funcionario implements Pagavel {
    private int numeroDeProjetos;

    public FuncionarioPJ(String nome, String cpf, double salarioBase, int numeroDeProjetos) {
        super(nome, cpf, salarioBase);
        this.numeroDeProjetos = numeroDeProjetos;
    }

    @Override
    public double calcularPagamento() {
        double salario = numeroDeProjetos * 350;
        return salario;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalarioBase());
    }

    @Override
    public void exibirDados(boolean comCpf) {
        if (comCpf) {
            System.out.println("Nome: " + getNome());
            System.out.println("Salário: " + getSalarioBase());
            System.out.println("CPF: " + getCpf());
        } else {
            exibirDados();
        }
    }
}
