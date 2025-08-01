package Exercicios.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5,8);
        Calculadora calc2 = new Calculadora();

        System.out.println("Soma de inteiros: "+calc.somar(6,3));
        System.out.println("Soma de doubles: "+calc.somar(3.5,9));
        System.out.printf("Soma de Strings: "+calc.somar("M", "L"));

    }
}
