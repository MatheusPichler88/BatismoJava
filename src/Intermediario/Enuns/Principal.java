package Intermediario.Enuns;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        DiaSemana[] dia = DiaSemana.values();
        Scanner sc = new Scanner(System.in);
            System.out.printf("Digite um número de 1 a 7: ");
            int numeroDigitado = sc.nextInt();
            DiaSemana diaEscolhido = dia[numeroDigitado-1];
            System.out.printf("Hoje é: "+diaEscolhido);

    }
}