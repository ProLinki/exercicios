package sistema;

import java.util.Properties;
import java.util.Set;

/**
 *
 * @author ProLinki
 */
public class PropriedadesSistema {

    public static void main(String[] args) {
        Properties properties = System.getProperties();

        Set<Object> keySet = properties.keySet();

        for (Object key : keySet) {
            System.out.println(key + " " + properties.get(key));
        }
    }
}
