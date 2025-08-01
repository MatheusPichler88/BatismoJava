package Intermediario.Enuns;

public enum Semafaro {
    VERMELHO( 60 ),
    AMARELO (5),
    VERDE(40);

    private final int tempo;

    Semafaro(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }


}
