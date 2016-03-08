package sistema;

import java.io.Console;

/**
 *
 * @author ProLinki
 */
public class CapturarSenhaPeloPrompt {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("User: ");
        String user = console.readLine();
        System.out.println("Password:");
        char[] key = console.readPassword();
        System.out.println("User: " + user + " Password: " + key);
    }
}
