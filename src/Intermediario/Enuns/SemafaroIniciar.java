package Intermediario.Enuns;

public class SemafaroIniciar {
    public static void main(String[] args) {
        System.out.println("Cores do semáfaro: ");
        for (Semafaro s: Semafaro.values()){
            System.out.printf("O sinal "+s+" dura "+s.getTempo()+" segundos.\n");
        }
    }
}
