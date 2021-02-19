package exercicios;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ValidadorDeSenhasComRequisitos {
    /*
        Desafio
        Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver
        o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código
        que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

        A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
        A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
        Além disso, a senha pode ter de 6 a 32 caracteres.

        Entrada
        A entrada contém vários casos de teste e termina com final de arquivo.
        Cada linha tem uma string S, correspondente a senha que é inserida pelo
        usuário no momento do cadastro.

        Saída
        A saída contém uma linha, que pode ser “Senha valida.”,
        caso a senha tenha cada item dos requisitos solicitados anteriormente,
        ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
     */

    public static void Executar(){

        try{
            Scanner input = new Scanner (System.in);
            input.useDelimiter("\\s");

            while(true){
                String entrada = input.nextLine();

                if(entrada.matches("[a-zA-Z0-9]{6,32}")){
                    // tem letras
                    // nao tem pontuacao e nao tem espaco
                    int mai=0, min=0, num=0;
                    for(int i =0; i < entrada.length(); i++){
                        if(String.valueOf(entrada.charAt(i)).matches("[a-z]")){
                            min++;
                        }else if(String.valueOf(entrada.charAt(i)).matches("[A-Z]")){
                            mai++;
                        }else if(String.valueOf(entrada.charAt(i)).matches("[0-9]")){
                            num++;
                        }
                    }
                    if(min > 0 && mai > 0 && num > 0){
                        System.out.println("Senha valida.");
                    }else{
                        System.out.println("Senha invalida.");
                    }
                }else{
                    System.out.println("Senha invalida.");
                }
            }

        }catch(NoSuchElementException e){

        }
    }
}