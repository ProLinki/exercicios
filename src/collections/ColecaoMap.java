package collections;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author ProLinki
 */
public class ColecaoMap {

    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<>();
        paises.put("BR", "Brasil");
        paises.put("RU", "Russia");
        paises.put("IN", "Índia");
        paises.put("CN", "China");
        System.out.println(paises);

        boolean contemBr = paises.containsKey("BR");
        System.out.println("Contém: BR " + ((contemBr == true) ? "Sim" : "Não"));
        boolean contemBz = paises.containsValue("Brazil");
        System.out.println("Contém: Brazil " + ((contemBz == true) ? "Sim" : "Não"));
        String pais = paises.get("CN");
        System.out.println("Sigla CN: " + pais);
        paises.remove("RU");
        System.out.println("Sem Russia: " + paises);
        Set<String> keySet = paises.keySet();
        for (String key : keySet) {
            System.out.println("Key: "+key+" Value: "+paises.get(key));
        }
    }
}
