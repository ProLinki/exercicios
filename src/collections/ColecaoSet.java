package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ProLinki
 */
public class ColecaoSet {

    public static void main(String[] args) {
        String[] cores = new String[]{"Verde", "Amarelo", "Azul", "Branco", "Azul", "Amarelo", "Verde"};

        /*Obs: List aceita duplicação de contéudo.*/
        List<String> list = Arrays.asList(cores);
        System.out.println("List:    " + list);

        /*Obs: Set não aceita duplicação de contéudo.*/
        Set<String> listSet = new HashSet<>(list);
        System.out.println("SetList: " + listSet);
    }
}
