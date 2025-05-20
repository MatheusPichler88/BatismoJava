package Desafio_3;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Takar Kunai de Fogo");
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("Nivel de Dificuldade: "+nivelDificuldade);
        System.out.println("Status da Missão:"+statusMissao);
        System.out.println("Essa é minha habilidade especial Uchiha");
    }
}
