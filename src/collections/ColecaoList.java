package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProLinki
 */
public class ColecaoList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Futebol");
        list.add("Basquete");
        list.add("Volei");
        list.add("Tênis");
        list.add("Natação");
        list.add("Hockey");
        list.add("Boxe");
        list.add("Futebol");
        
        //Exibir contéudo.
        System.out.println(list);
            
        //Percorrer cada índice da lista.
        for (int i = 0; i < list.size(); i++) {
            String palavra = list.get(i);
            list.set(i, palavra.toUpperCase());
        }
        //Exibir contéudo modificado.
        System.out.println(list);
        //Obter índice da palavra. 
        System.out.println(list.indexOf("BOXE"));
        //Obter contéudo apartir de um intervalo.
        System.out.println(list.subList(2, 4));
        //Remover contéudo contido na s
        list.subList(2, 4).clear();
        System.out.println(list);
    }
}
