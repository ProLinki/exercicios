package arrays;

/**
 *
 * @author ProLinki
 */
public class Unidimencional {

    public static void main(String[] args) {
        Integer indices=5;//Variável auxiliar.
        String[] nomes; //Declaração.
        nomes = new String[indices];//Criação e reserva de espaço.
        
        /*Atribuição de valores.*/
        nomes[0] = "Lucas";
        nomes[1] = "Ana";
        nomes[2] = "Beth";
        nomes[3] = "Fernanda";
        nomes[4] = "Marcos";
        
        /*Percorrer cada posição do vetor.*/
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d° nome é %s.\n", i, nomes[i]);
        }
    }
}