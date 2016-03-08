package erros;

import java.util.Scanner;

/**
 *
 * @author ProLinki
 */
public class EntradaIncompativel {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        /*Obs: se a entrada de dados for diferente da (exigida) ou então atribuir um valor a um determinado tipo não suporta
         então ocorrerá o erro java.util.InputMismatchException*/
        /*
         * Tente atribuir valor boolean, double, float ,String, char a uma variável do tipo int. 
         */
        System.out.print("Entre com um valor inteiro: ");
        int valor = console.nextInt();
        System.out.println(valor);
    }
}
