package Intermediario.Generics.Ex2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Cesta<String> cestaFrutas = new Cesta<>("Fruta",new ArrayList<>());

        //Adicionando frutas na Cesta
        cestaFrutas.adicionarFruta("Banana");
        cestaFrutas.adicionarFruta("Morango");
        cestaFrutas.adicionarFruta("Abacaxi");
        cestaFrutas.adicionarFruta("Goiaba");
        cestaFrutas.adicionarFruta("Uva");

        //Listando todas as frutas na Cesta
        System.out.println(cestaFrutas);
        }
    }

