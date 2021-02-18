import exercicios.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        StringBuilder menu = new StringBuilder();
        boolean loop = true;
        menu.append("Menu:\n");
        menu.append("1 - Quantidade de Números Positivos\n");
        menu.append("2 - Exibindo Números Pares\n");
        menu.append("3 - Análise de Números\n");
        menu.append("4 - Contagem de Cédulas\n");
        menu.append("5 - Consumo Médio do Automóvel\n");
        menu.append("6 - Ordenacao e Filtros em Java\n");
        menu.append("7 - Compras no Supermercado\n");
        menu.append("8 - Uniformes de final de ano\n");
        menu.append("9 - Fila do Banco\n");
        menu.append("10 - Gincana no Acampamento\n");
        menu.append("0 - Sair");

        BufferedReader br;
        StringTokenizer st;

        do{

            System.out.println("\r");
            System.out.println(menu);

            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Opção: ");
            st = new StringTokenizer(br.readLine());
            String valor = st.nextToken();

            switch (valor) {
                case "1" -> QuantidadedeNumerosPositivos.Executar();
                case "2" -> ExibindoNumerosPares.Executar();
                case "3" -> AnaliseDeNumeros.Executar();
                case "4" -> ContagemDeCedulas.Executar();
                case "5" -> ConsumoMedioDoAutomovel.Executar();
                case "6" -> OrdenacaoEFiltrosEmJava.Executar();
                case "7" -> ComprasNoSupermercado.Executar();
                case "8" -> UniformesDeFinalDeAno.Executar();
                case "9" -> FiladoBanco.Executar();
                case "10" -> GincanaNoAcampamento.Executar();
                case "0" -> loop = false;
                default -> System.out.println("Opção Inválida! Digite uma opcao válida ou zero (0) para sair");
            }

        }while(loop);
    }
}
