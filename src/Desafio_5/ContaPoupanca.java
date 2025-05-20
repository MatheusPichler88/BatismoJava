package Desafio_5;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String nome, String numeroConta, double saldo) {
        super(nome, numeroConta, saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor de R$ " + valor + " depositado.");
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);

    }
}
