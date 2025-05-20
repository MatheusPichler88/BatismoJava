package Desafio_2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ArrayNinja = new String[6];
        int op = 1;

        while (op != 0) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninjas");
            System.out.println("2. Listar Ninjas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    for (int i = 1; i < ArrayNinja.length; i++) {
                        System.out.println("Insira o nome do Ninja " + i + ":");
                        ArrayNinja[i] = sc.nextLine();
                    }
                    break;
                case 2:
                    for (int i = 1; i < ArrayNinja.length; i++) {
                        System.out.println("Ninja " + i + ":" + ArrayNinja[i]);
                    }
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Não é possivel execultar essa ação!");
            }

        }
    }
}
