package Intermediario.Listas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaTarefas {
    List<String> listaTarefas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void adicionarTarefas() {
        System.out.println("Digite a tarefa a ser adicionada: ");
        listaTarefas.add(sc.nextLine());
    }

    public void listarTarefas() {
        System.out.print("Lista de Tarefas: \n");
        System.out.println("------------------");
        int contador = 1;
        for (String tarefa : listaTarefas){
            System.out.printf("%d - %s%n", contador, tarefa);
            contador++;        }
        System.out.println("------------------");
    }

    public void excluirTarefas() {
        System.out.println("Digite o índice da tarefa a ser excluida: ");
        int tarefaExcluida = sc.nextInt();
        int i = tarefaExcluida - 1;
        listaTarefas.remove(i);
    }
}

