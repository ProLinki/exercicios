package threads.testathread;

import java.util.Random;

/**
 *
 * @author ProLinki
 */
public class Produtora implements Runnable {

    private final Ponte ponte;
    private final Random aleatorio;

    public Produtora(Ponte ponte) {
        this.ponte = ponte;
        this.aleatorio = new Random();
    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(aleatorio.nextInt(3000));
                total += i;
                ponte.set(i);
                System.out.println("Produtora Total: " + total);
            } catch (InterruptedException ie) {
            }
        }
    }
}
