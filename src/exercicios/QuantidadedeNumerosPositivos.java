package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    Desafio
    Crie um programa que leia 6 valores.
    Você poderá receber valores negativos e/ou positivos como entrada, devendo desconsiderar os valores nulos.
    Em seguida, apresente a quantidade de valores positivos digitados.

    Entrada
    Você receberá seis valores, negativos e/ou positivos.

    Saída
    Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
    não esqueça da mensagem "valores positivos" ao final.
 */


public class QuantidadedeNumerosPositivos {

    public static void Executar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int contador=0;
        for(int i=0; i < 6; i++){
            st = new StringTokenizer(br.readLine());
            double valor = Double.parseDouble(st.nextToken());
            if(valor > 0){
                contador++;
            }
        }

        System.out.println(contador + " valores positivos");
    }
}
