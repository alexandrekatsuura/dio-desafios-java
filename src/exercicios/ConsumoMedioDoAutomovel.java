package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/*
    Desafio
    Você deve calcular o consumo médio de um automóvel onde será informada a
    distância total percorrida (em Km) e o total de combustível consumido (em litros).

    Entrada
    Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km),
    e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.

    Saída
    Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula),
    incluindo no final a mensagem "km/l".
 */

public class ConsumoMedioDoAutomovel {
    public static void Executar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double distancia = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double litros = Double.parseDouble(st.nextToken());


        double resposta = distancia/ litros;

        DecimalFormat formatador = new DecimalFormat("0.000");

        System.out.println(formatador.format(resposta) + " km/l");
    }
}
