package exercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
    Desafio
    Crie um programa onde você receberá valores inteiros não negativos como entrada.

    Ordene estes valores de acordo com o seguinte critério:

    Primeiro os Pares
    Depois os Ímpares
    Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

    Entrada
    A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
    Este é o número de linhas de entrada que vem logo a seguir.
    As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

    Saída
    Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
    Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
 */


public class OrdenacaoEFiltrosEmJava {

    public static void Executar(){
        Scanner input = new Scanner (System.in);
        int entradas = Integer.valueOf(input.nextLine());

        List pares = new ArrayList();
        List impares = new ArrayList();


        for(int i =0; i < entradas; i++){
            int entrada = Integer.valueOf(input.nextLine());
            if(entrada%2 ==0){
                pares.add(entrada);
            }else{
                impares.add(entrada);
            }
        }

        pares.sort(Comparator.naturalOrder());
        impares.sort(Comparator.reverseOrder());

        pares.stream().forEach(par -> System.out.println(par));
        impares.stream().forEach(impar -> System.out.println(impar));
    }

}

