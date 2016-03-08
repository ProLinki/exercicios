package threads.testathread;

/**
 *
 * @author ProLinki
 */
public class PonteTeste {

    public static void main(String[] args) {
        Ponte p = new PonteSincronizada();
        new Thread(new Produtora(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
