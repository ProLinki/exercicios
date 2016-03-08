package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ProLinki
 */
public class Colecao {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("A");
        c.add("E");
        c.add("I");

        System.out.println("Contéudo   : " + c.toString());
        System.out.println("Está Vázio : " + c.isEmpty());
        System.out.println("Contém I   : " + c.contains("I"));
        System.out.println("Remove A   : " + !c.remove("A"));

        /*Grupos de elementos*/
        Collection<String> c2 = Arrays.asList("0", "U");
        c.addAll(c2);

        System.out.println("Contéudo: " + c.toString());
        boolean contem = c.containsAll(c2);
        System.out.println("Contém todos: " + contem);
        boolean remove = c.removeAll(c2);
        System.out.println("Todos foram removidos: " + remove);

        /*Percorrer os elementos*/
        for (String value : c) {
            System.out.println("Valor: " + value);
        }

        /*Passar coleção para uma Array*/
        String[] s = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(s));

        c.clear();
        System.out.println("Vázio: " + (c.isEmpty() ? "Sim" : "Não"));

        Map<String,Integer> n = new HashMap<>();
        n.put("okok", 1);
        System.out.println("okokok"+n);
        
    }
}
