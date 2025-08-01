package Exercicios.Animais;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        ArrayList<String> lista = new ArrayList<String>();

        lista.add(gato.fazerSom());
        lista.add(cachorro.fazerSom());

    }
}
