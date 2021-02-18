package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    Desafio
    Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
    onde o valor pode ser decomposto.
    As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
    Na sequência mostre o valor lido e a relação de notas necessárias.

    Entrada
    Você receberá um valor inteiro N (0 < N < 1000000).

    Saída
    Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo.
    Após cada linha deve ser imprimido o fim de linha.

 */

public class ContagemDeCedulas {
    public static void Executar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nota100=0, nota50=0, nota20=0, nota10=0, nota5=0, nota2=0, nota1=0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int entrada = Integer.parseInt(st.nextToken());

        System.out.println(entrada);
        nota100 = (entrada - entrada%100)/100;
        nota50 =  (entrada%100 - (entrada%100)%50)/50;
        nota20 = ((entrada%100)%50 - ((entrada%100)%50)%20)/20;
        nota10 = ( ((entrada%100)%50)%20 - (((entrada%100)%50)%20)%10 )/10;
        nota5 = ( (((entrada%100)%50)%20)%10 - ((((entrada%100)%50)%20)%10)%5)/5;
        nota2=  (((((entrada%100)%50)%20)%10)%5 - (((((entrada%100)%50)%20)%10)%5)%2)/2;
        nota1=  (((((entrada%100)%50)%20)%10)%5)%2;



        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
}
