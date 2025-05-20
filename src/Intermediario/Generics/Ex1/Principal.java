package Intermediario.Generics.Ex1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Caixa<String> ListaItens = new Caixa<>("Frase",new ArrayList<>());

        //Adiciona uma frase na lista.
        ListaItens.getListaItens().add("Java é dificil.");
        ListaItens.getListaItens().add("Tenho QI de um macaco prego");

        //Pegando a frase na lista
        String FraseBuscada = ListaItens.pegarItem("Tenho QI de um macaco prego");

        //Imprimindo frase
        System.out.println("Frase da caixa: "+FraseBuscada);
    }
}
