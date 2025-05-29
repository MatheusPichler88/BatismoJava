package Exercicios.CadastroVeicular;

import java.util.Scanner;

public class Carro extends Veiculo {
    private int numeroPortas;
    Scanner sc = new Scanner(System.in);

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularDiaria(int dias) {
        System.out.println("Quantos dias de aluguel?");
        return dias * 120;
    }

    @Override
    public String toString() {
        return "\n========= DETALHES DO CARRO =========" +
                "\nMarca       : " + getMarca() +
                "\nModelo      : " + getModelo() +
                "\nAno         : " + getAno() +
                "\nPortas      : " + numeroPortas +
                "\n=====================================";
    }
}
