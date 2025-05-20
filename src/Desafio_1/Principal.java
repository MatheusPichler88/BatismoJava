package Desafio_1;

public class Principal {
    public static void main(String[] args) {

        //Ninja 1
        String ninja1 = "Naruto";
        int idade = 14;
        String missao = "Correr 10km";
        char nivelDificuldade = 'D';
        String statusMissao = "Em andamento";

        if (idade < 15) {
            if (nivelDificuldade == 'C' || nivelDificuldade == 'D') {
                statusMissao = "Missão Concluida";
            } else {
                statusMissao = "Missão não Concluida";
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Nome: " + ninja1 + "\nIdade: " + idade + "\nMissao: " + missao + "\nNivel de dificuldade: " + nivelDificuldade + "\nStatus da Missao: " + statusMissao);
        System.out.println("-------------------------------");

        //Ninja 2
        String ninja2 = "Sakumara";
        int idade2 = 13;
        String missao2 = "Correr 2km";
        char nivelDificuldade2 = 'D';
        String statusMissao2 = "Em andamento";

        if (idade2 < 15) {
            if (nivelDificuldade2 == 'C' || nivelDificuldade2 == 'D') {
                statusMissao2 = "Missão Concluida";
            } else {
                statusMissao2 = "Missão não Concluida";
            }
        }

        System.out.println("Nome: " + ninja2 + "\nIdade: " + idade2 + "\nMissao: " + missao2 + "\nNivel de dificuldade: " + nivelDificuldade2 + "\nStatus da Missao: " + statusMissao2);
        System.out.println("-------------------------------");
        //Ninja 3
        String ninja3 = "Halen";
        int idade3 = 12;
        String missao3 = "Correr 50km";
        char nivelDificuldade3 = 'A';
        String statusMissao3 = "Em andamento";

        if (idade3 < 15) {
            if (nivelDificuldade3 == 'C' || nivelDificuldade3 == 'D') {
                statusMissao3 = "Missão Concluida";
            }
            else {
                statusMissao3 = "Missão não Concluida";
            }
        }

        System.out.println("Nome: " + ninja3 + "\nIdade: " + idade3 + "\nMissao: " + missao3 + "\nNivel de dificuldade: " + nivelDificuldade3 + "\nStatus da Missao: " + statusMissao3);
        System.out.println("-------------------------------");
    }
}



