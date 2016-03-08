package arrays;

/**
 *
 * @author ProLinki
 */
public class Bidimensional {

    public static void main(String[] args) {
        /*Variáveis auxiliares.*/
        Integer linhas = 2;
        Integer colunas = 2;
        
        /*Declaração e criação da matriz bidimensional.*/
        String[][] bidimensional = new String[linhas][colunas];
        
        /*Atribuição de valores.*/
        bidimensional[0][0] = "Lucas"; 
        bidimensional[0][1] = "Anna";
        bidimensional[1][0] = "Beth";
        bidimensional[1][1] = "Katarina";

        /*Percorrendo cada posição*/
        for(int i =0; i < bidimensional.length; i++){ // Percorre as linhas.
            for(int j=0; j < bidimensional[i].length; j++){ // Percorre as colunas.
                System.out.printf("Nome: %s\n",bidimensional[i][j]);
            }
        }
    }
}
