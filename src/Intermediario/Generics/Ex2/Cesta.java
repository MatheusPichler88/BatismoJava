package Intermediario.Generics.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Cesta<T>{
    private String fruta;
    private List<T> cestaFrutas;

    public Cesta(String fruta, List<T> cestaFrutas) {
        this.fruta = fruta;
        this.cestaFrutas = cestaFrutas;
    }

    public String getFruta() {
        return fruta;
    }

    public List<T> getCestaFrutas() {
        return cestaFrutas;
    }

    public void adicionarFruta(T fruta){
        cestaFrutas.add(fruta);
        System.out.println("Foi adicionado a fruta "+fruta+" na cesta!");
    }
    public T listarFrutas(T fruta){
        if(cestaFrutas.contains(fruta)){
            int i = cestaFrutas.indexOf(fruta);
            return cestaFrutas.get(i);
        }
        else{
            System.out.println("A fruta "+fruta+"não está na lista!");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Cesta:" +cestaFrutas;
    }
}
