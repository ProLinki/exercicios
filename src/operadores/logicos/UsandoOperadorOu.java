package operadores.logicos;

/**
 * @author ProLinki
 */
public class UsandoOperadorOu {

    public static void main(String[] args) {
        boolean i = false;
        boolean j = true;
       
        /*Utilizando o simbolo chamado de PIPE | que representa a expressão OU, retorna true se pelo menos uma espressão for verdadeira.*/
        if ((i) | (j)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        /*----------------------------*/
        j = i = false;
        if ((i) || (j)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
