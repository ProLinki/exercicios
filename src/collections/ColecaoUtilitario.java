package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ProLinki
 */
public class ColecaoUtilitario {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Guaraná");
        list.add("Uva");
        list.add("Manga");
        list.add("Coco");
        list.add("Açaí");
        list.add("Banana");
        System.out.println("Contéudo da lista:  " + list);

        //Ordena o contéudo em ordem alfabetica.
        Collections.sort(list);
        System.out.println("Ordem alfabetica:   " + list);

        //Ordena o contéudo em ordem reversa.
        Collections.reverse(list);
        System.out.println("Ordem reversa:      " + list);

        //Embaralha os dados aleatoriamente.
        Collections.shuffle(list);
        System.out.println("Ordem aleatóia:     " + list);

        //Adiciona mais contéudo a lista.
        Collections.addAll(list, "Cupuaçu", "Laranja", "Maça", "Laranja");
        System.out.println("Contéudo da lista:  " + list);

        //Pega a quantidade de vezes que uma palavra aparece na lista.
        int quantidade = Collections.frequency(list, "Laranja");
        System.out.println("Aparece:\t    [" + quantidade + "] vezes");

        List<String> list2 = Arrays.asList("Acerola", "Graviola");
        //Verifica se na lista principal contém o contéudo da lista2.
        boolean contem = Collections.disjoint(list, list2);

        Collections.sort(list);

        //Pega o índice da palavra.
        int indice = Collections.binarySearch(list, "Guaraná");
        System.out.println("Índice: \t    [" + indice + "]");

        //Substitui todas as palavras da lista por outra.
        Collections.fill(list, "Açaí");
        System.out.println(list);

        /*Coleção não modificável*/
        Collection<String> constante = Collections.unmodifiableCollection(list);
    }
}
