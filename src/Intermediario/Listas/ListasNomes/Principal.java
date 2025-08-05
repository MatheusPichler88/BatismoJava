package Intermediario.Listas.ListasNomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("---------MENU--------");
        while (true) {
            System.out.println("Digite um nome(ou sair para encerrar): ");
            String nomeDigitado = sc.nextLine();
            if(nomeDigitado.equalsIgnoreCase("Sair")){
                break;
            }
            else{
            listaNomes.add(nomeDigitado);
                System.out.println("Nome adicionado na lista.");
            }
        }
        System.out.println("Lista de nomes: ");
        for (String lista : listaNomes) {
            System.out.println(lista);
        }
        sc.close();
    }
}
