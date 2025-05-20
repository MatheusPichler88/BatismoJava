package Desafio_4;

public class Principal {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Sasuke Uchiha", 16, "Genjutsu");
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Naruto Uzumaki", 18, "Ninjutsu", "Rasenshuriken");

        //Ninja Básico
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.execultarHabilidade();

        //Ninja Avançado
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.execultarHabilidade();
    }
}
