package Intermediario.Generics.Ex1;

import java.util.List;

public class Caixa<T> {
    private String frase;
    private List<T> ListaItens;

    public Caixa(String frase, List<T> listaItens) {
        this.frase = frase;
        ListaItens = listaItens;
    }

    public String getFrase() {
        return frase;
    }

    public List<T> getListaItens() {
        return ListaItens;
    }

    public void guardarItens(T item){
        ListaItens.add(item);
        System.out.println("Você adicionou "+item+"na caixa!");
    }
    public T pegarItem(T item) {
        if (ListaItens.contains(item)) {
            int i = ListaItens.indexOf(item);
            return ListaItens.get(i);
        } else {
            System.out.println("O item não está na lista!");
            return null;
        }
    }
}
