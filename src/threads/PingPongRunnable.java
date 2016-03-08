package threads;

/**
 *
 * @author ProLinki
 */
public class PingPongRunnable implements Runnable {
    /*Aramazena palavra a ser imprimida.*/

    private final String palavra;

    /*Tempo para imprimir uma palavra.*/
    private final long tempo;

    public PingPongRunnable(String palavra, long tempo) {
        this.palavra = palavra;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(palavra + " - " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        Runnable a = new PingPongRunnable("Ping", 1500);
        Runnable b = new PingPongRunnable("Pong", 2000);
        System.out.println("Ver Thread");

        new Thread(a, "ping").start();
        new Thread(b, "pong").start();

    }
}
