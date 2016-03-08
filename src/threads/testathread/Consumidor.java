package threads.testathread;

import java.util.Random;

/**
 *
 * @author ProLinki
 */
public class Consumidor implements Runnable {

    private final Ponte ponte;
    private final Random aleatorio;

    public Consumidor(Ponte ponte) {
        this.ponte = ponte;
        this.aleatorio = new Random();
    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(aleatorio.nextInt(3000));
                total += ponte.get();
                System.err.println("Consumidora Total: " + total);
            } catch (InterruptedException ie) {
            }
        }
    }
}
