package Exercicios.SistemaPagamento;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

        public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public abstract double calcularPagamento();
    public abstract void exibirDados();

    public abstract void exibirDados(boolean comCpf);
}


