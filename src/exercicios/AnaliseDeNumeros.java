package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    Desafio
    Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
    quantos valores informados são ímpares, quantos valores informados são positivos
    e quantos valores informados são negativos.

    Entrada
    Você receberá 5 valores inteiros.

    Saída
    Exiba a mensagem conforme o exemplo de saída abaixo,
    sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
 */

public class AnaliseDeNumeros {
    public static void Executar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int par = 0, impar=0,positivo=0,negativo=0;

        for (int i =  0; i <  5; i++) {
            st = new StringTokenizer(br.readLine());
            int entrada = Integer.parseInt(st.nextToken());

            if (entrada%2 == 0 )
                par ++;
            else
                impar++;

            if(entrada > 0)
                positivo++;
            else if(entrada < 0)
                negativo++;
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
