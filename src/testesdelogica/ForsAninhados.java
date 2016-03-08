package testesdelogica;

/**
 *
 * @author ProLinki
 */
public class ForsAninhados {

    public static void main(String[] args) {
        loopForI:
        for (int i = 0; i < 10; i++) {
            System.out.println("----- " + i + " -----");
            loopForJ:
            for (int j = 0; j < 10; j++) {
                System.out.println("J: [" + j + "]");
                if (j == 9 && i == 3) {
                    break loopForI;
                }
            }
        }
    }
}
