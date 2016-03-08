package sistema;

import java.io.IOException;

/**
 *
 * @author ProLinki
 */
public class RunTime {

    public static void main(String[] args) throws IOException {
        String[] listaPragramas = new String[]{"calc", "notepad", "Notepad++"};
        for (String nome : listaPragramas) {
            Runtime.getRuntime().exec(nome);
        }
    }
}
