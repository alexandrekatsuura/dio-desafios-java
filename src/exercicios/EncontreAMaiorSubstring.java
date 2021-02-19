package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EncontreAMaiorSubstring {
    /*
        Desafio
        Encontre a maior substring comum entre as duas strings informadas.
        A substring pode ser qualquer parte da string, inclusive ela toda.
        Se não houver subseqüência comum, a saída deve ser “0”.
        A comparação é case sensitive ('x' != 'X').

        Entrada
        A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas,
        cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres
        ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

        Saída
        O tamanho da maior subsequência comum entre as duas Strings.
     */
    public static void Executar(){
        try{


            Scanner input = new Scanner (System.in);
            input.useDelimiter("\\s");

            List<Integer> comuns = new ArrayList();
            while(true){


                String entrada1 = input.nextLine();
                if(entrada1.isBlank() || entrada1.equals("\n")){
                    break;
                }
                String entrada2 = input.nextLine();


                int comum =0;
                int cont = 1;

                // usar a menor
                if(entrada1.length() >= entrada2.length()){
                    int sub2 = entrada2.length();;
                    while(sub2 > 0){
                        for(int i =0; i <= entrada1.length() - sub2 ; i++){
                            for(int k= 0; k < cont; k++){
                                if(entrada1.substring(i,i+sub2).equals(entrada2.substring(k,k+sub2))){
                                    comum = Math.max(sub2, comum);
                                    sub2 = 0;
                                }
                            }

                        }
                        sub2--;
                        cont++;
                    }
                }else{
                    int sub1 = entrada1.length();;
                    while(sub1 > 0){
                        for(int i =0; i <= entrada2.length() - sub1 ; i++){
                            for(int k= 0; k < cont; k++){
                                if(entrada2.substring(i,i+sub1).equals(entrada1.substring(k,k+sub1))){
                                    comum = Math.max(sub1, comum);
                                    sub1 = 0;
                                }
                            }
                        }
                        sub1--;
                        cont++;
                    }
                }

                System.out.println(comum);
            }
        }catch(NoSuchElementException e){

        }


    }


}
