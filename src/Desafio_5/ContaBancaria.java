package Desafio_5;

public abstract class ContaBancaria implements Conta {
    private String nome;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

}

