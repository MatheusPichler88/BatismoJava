package Desafio_5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int op = 1;
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente("Matheus Dias Pichler", "030867635-1", 2500);
        ContaPoupanca cp = new ContaPoupanca("Matheus Dias Pichler", "030867635-1", 8200);
        while (op != 0) {
            System.out.println("----------Menu----------");
            System.out.println("1-Consultar saldo");
            System.out.println("2-Depositar");
            System.out.println("0-Sair");
            System.out.println("Opção escolhida:");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("1-Conta Corrente");
                System.out.println("2-Conta Poupança");
                int tipoConta = sc.nextInt();
                switch (tipoConta) {
                    case 1:
                        cc.consultarSaldo();
                        break;
                    case 2:
                        cp.consultarSaldo();
                        break;
                    default:
                        System.out.println("Opção invalida!");
                }

            } else if (op == 2) {
                System.out.println("1-Conta Corrente");
                System.out.println("2-Conta Poupança");
                int tipoConta = sc.nextInt();
                double valor;
                switch (tipoConta) {
                    case 1:
                        System.out.println("Digite o valor para depositar: ");
                        valor = sc.nextDouble();
                        cc.depositar(valor);
                        break;
                    case 2:
                        System.out.println("Digite o valor para depositar: ");
                        valor = sc.nextDouble();
                        cp.depositar(valor);
                        break;
                }

            } else {
                System.out.println("Saindo...");
            }
        }
        sc.close();

    }
}
