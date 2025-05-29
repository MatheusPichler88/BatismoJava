package Exercicios.CadastroVeicular;

import java.util.Scanner;

public class Moto extends Veiculo {
    private int cilindradas;
    Scanner sc = new Scanner(System.in);

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiaria(int dias) {
        return dias * 70;
    }

    @Override
    public String toString() {
        return "\n========= DETALHES DA MOTO =========" +
                "\nMarca       : " + getMarca() +
                "\nModelo      : " + getModelo() +
                "\nAno         : " + getAno() +
                "\nCilindradas      : " + cilindradas +
                "\n=====================================";
    }
}
