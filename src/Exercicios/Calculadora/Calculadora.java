package Exercicios.Calculadora;

public class Calculadora {
    private double a;
    private double b;

    public Calculadora() {
        System.out.printf("Calculadora Iniciada!\n");
    }

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
        double c = a+b;
        System.out.println("A soma de a+b é: "+ c);
    }

    public int somar(int a, int b){
        return a+b;
    }

    public double somar(double a, double b){
        return a+b;
    }


    public String somar(String a, String b){
        return a+b;
    }
}
