package threads;

/**
 *
 * @author ProLinki
 */
public class PingPongThread extends Thread {
    /*Aramazena palavra a ser imprimida.*/

    private final String palavra;

    /*Tempo para imprimir uma palavra.*/
    private final long tempo;

    public PingPongThread(String palavra, long tempo) {
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
        new PingPongThread("Ping", 1500).start();
        new PingPongThread("Pong", 2000).start();
        System.out.println("Ver Thread");
    }
}
