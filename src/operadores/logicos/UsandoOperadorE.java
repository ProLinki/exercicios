package operadores.logicos;

/**
 *
 * @author ProLinki
 */
public class UsandoOperadorE {

    public static void main(String[] args) {
        boolean i = true;
        boolean j = true;

        /*Utilizando o simbolo chamado de Écomercial & que representa a expressão E, retorna true se todas as espressões espressão forem verdadeiras.*/
        if ((i) & (j)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        i = false;

        if ((i) && (j)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
