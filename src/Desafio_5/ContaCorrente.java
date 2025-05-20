package Desafio_5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String nome, String numeroConta, double saldo) {
        super(nome, numeroConta, saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        System.out.println("Está sendo cobrado uma taxa de R$ " + taxa + " para o deposito.");
        double novoValor = valor - taxa;
        setSaldo(getSaldo() + novoValor);
    }
}
