package erros;

/**
 *
 * @author ProLinki
 */
public class AcessarIndiceQueNaoExiste {

    public static void main(String[] args) {
        String[] nomes = new String[]{"Lucas", "Ana", "Beth"};
        /*Forçar o loop a acessar um indice que não existe, gera o erro java.lang.ArrayIndexOutOfBoundsException.*/
        for (int i = 0; i < 4; i++) {
            System.out.printf("Índice [%d] nome %s\n", i, nomes[i]);
        }
    }
}
