package Desafio_3;

public class Principal {
    public static void main(String[] args) {

        Uchiha ninja = new Uchiha();

        //ninja Uchiha
        ninja.nome = "Sasuke Uchiha";
        ninja.idade = 16;
        ninja.missao = "Curar";
        ninja.nivelDificuldade = "B";
        ninja.statusMissao = "Em Andamento";

        ninja.mostrarInformacoes();
        ninja.mostrarHabilidadeEspecial();
    }
}
