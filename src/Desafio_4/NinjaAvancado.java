package Desafio_4;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    private  String especiabilidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especiabilidade) {
        super(nome, idade, habilidade);
        this.especiabilidade = especiabilidade;
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Habilidade: " + getHabilidade());
        System.out.println("Especiabilidade: " + especiabilidade);
    }

    @Override
    public void execultarHabilidade() {
        System.out.println("Sou um Ninja avançado " + getNome() + "e estou usando minha habilidade especial " + especiabilidade);
        System.out.println("-------------------------");
    }
}
