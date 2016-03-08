package pratica;

import java.util.Arrays;

/**
 *
 * @author ProLinki
 */
public class StringsTokens {

    public static void main(String[] args) {
        String s = "Java; jQuery; SQL; Oracle; NetBeans;";
        String[] tokens = s.split(";");
        System.out.println(tokens.length);
        System.out.println(Arrays.toString(tokens));
    }
}
