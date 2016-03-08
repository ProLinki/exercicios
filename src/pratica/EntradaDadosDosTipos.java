package pratica;
//IMPORTAÇÃO DA CLASSE <b>Scanner</b> NO PACOTE java.util

import java.util.Scanner;

public class EntradaDadosDosTipos {

    public static void main(String[] args) {
        //LINHA RESPONSÁVEL POR ATIVAR O TECLADO COMO ENTRADA DE DADOS.
        Scanner teclado = new Scanner(System.in);

        //ENTRA DE UM VALOR BYTE.  
        System.out.print("Qual a sua idade? ");
       
        //ENTRA DE UM VALOR SHORT.
        System.out.print("\nQuantos amigos você tem? ");

        //ENTRA DE UM VALOR INT.
        System.out.print("\nQual o ano atual? ");

        //ENTRA DE UM VALOR LONG.
        System.out.print("\nQuanto você quer de dinheiro na sua conta? ");

        //ENTRA DE UM VALOR FLOAT.  
        System.out.print("\nQuanto custa uma coxinha? ");

        //ENTRA DE UM VALOR DOUBLE.
        System.out.print("\nQuanto você está devendo hein? ");

        //ENTRA DE UM VALOR BOOLEAN.
        System.out.print("\nVocê é casado? true/false");

        //ENTRA DE UM VALOR CHAR.
        System.out.print("\nQual o seu sexo? F/M ");
        
        //ENTRA DE UM VALOR STRING.
        System.out.print("\nDiga-me seu nome: ");   
    }
}
