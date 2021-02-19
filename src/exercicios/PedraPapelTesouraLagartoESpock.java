package exercicios;

import java.util.Scanner;

public class PedraPapelTesouraLagartoESpock {
    /*
        Desafio
        Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em
        jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico,
        mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a uma boca de fantoche)
        e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma
        rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla,
        como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

        Tesoura corta papel
        Papel cobre pedra
        Pedra derruba lagarto
        Lagarto adormece Spock
        Spock derrete tesoura
        Tesoura prende lagarto
        Lagarto come papel
        Papel refuta Spock
        Spock vaporiza pedra
        Pedra quebra tesoura

        Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro,
        com esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem,
        informe quem irá ganhar ou se dará empate.

        Entrada
        Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a
        quantidade de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de
        Fernanda e de Marcia, respectivamente.

        Saída
        Para cada caso de teste, imprima quem venceu, ou se houve empate.
     */
    public static void Executar(){
        Scanner input = new Scanner (System.in);
        input.useDelimiter("\\s");


        int testes = Integer.parseInt(input.nextLine());

        for(int i = 0; i < testes; i++){
            String[] escolhas = input.nextLine().split(" ");
            String vencedor = "";
            switch (escolhas[0]){
                case "tesoura":
                    vencedor = !escolhas[0].equals(escolhas[1]) ? escolhas[1].equals("papel") || escolhas[1].equals("lagarto") ? "fernanda": "marcia" : "empate";
                    break;
                case "papel":
                    vencedor = !escolhas[0].equals(escolhas[1]) ? escolhas[1].equals("pedra") || escolhas[1].equals("spock") ? "fernanda": "marcia": "empate";
                    break;
                case "pedra":
                    vencedor = !escolhas[0].equals(escolhas[1]) ? escolhas[1].equals("lagarto") || escolhas[1].equals("tesoura") ? "fernanda": "marcia": "empate";
                    break;
                case "lagarto":
                    vencedor = !escolhas[0].equals(escolhas[1]) ? escolhas[1].equals("spock") || escolhas[1].equals("papel") ? "fernanda": "marcia": "empate";
                    break;
                case "spock":
                    vencedor = !escolhas[0].equals(escolhas[1]) ? escolhas[1].equals("tesoura") || escolhas[1].equals("pedra") ? "fernanda": "marcia": "empate";
                    break;
                default:
                    break;
            }

            System.out.println(vencedor);

        }
    }
}
