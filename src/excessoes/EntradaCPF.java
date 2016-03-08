package excessoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProLinki
 */
public class EntradaCPF {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Entre com seu cpf: ");
        System.out.println(Operacao.validaCPF(console.next()));
    }
}
