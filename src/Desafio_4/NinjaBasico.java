package Desafio_4;

public class NinjaBasico implements Ninja {

    private String nome;
    private int idade;
    private String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    public void execultarHabilidade() {
        System.out.println("Sou o Ninja " + nome + " e estou usando minha habilidade " + habilidade);
        System.out.println("-------------------------");
    }
}
