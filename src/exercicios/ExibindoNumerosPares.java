package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    Desafios
    Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

    Entrada
    Você receberá 1 valor inteiro N, onde N > 0.

    Saída
    Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
 */

public class ExibindoNumerosPares {

    public static void Executar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int entrada = Integer.parseInt(st.nextToken());

        for (int i =  0; i <=  entrada; i++) {
            if (i%2 == 0 && i > 0) System.out.println(i);
        }
    }
}
