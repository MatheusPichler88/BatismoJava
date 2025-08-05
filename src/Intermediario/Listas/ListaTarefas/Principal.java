package Intermediario.Listas.ListaTarefas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        Scanner sc = new Scanner(System.in);

        System.out.println("---------MENU--------");
        int escolha = 1;
        while (escolha!=0) {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    lista.adicionarTarefas();
                    break;
                case 2:
                    lista.listarTarefas();
                    break;
                case 3:
                lista.excluirTarefas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                    default:
                    System.out.println("Opção invalida!");
            }

        }
    }
}