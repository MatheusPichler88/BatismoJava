package Exercicios.CadastroVeicular;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo carro = new Carro("Fiat", "Palio", 2014, 4);
        Veiculo moto = new Moto("Honda", "CG-150",2022,150);

        //Carro
        System.out.println("Quantos dias de aluguel do Carro?");
        System.out.println("Valor do aluguel: "+carro.calcularDiaria(sc.nextInt()));
        System.out.println(carro);

        //Moto
        System.out.println("Quantos dias de aluguel da moto?");
        System.out.println("Valor do aluguel: "+moto.calcularDiaria(sc.nextInt()));
        System.out.println(moto);

    }
}
