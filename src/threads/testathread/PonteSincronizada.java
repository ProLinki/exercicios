package threads.testathread;

/**
 *
 * @author ProLinki
 */
public class PonteSincronizada implements Ponte {

    private int valor = -1;

    @Override
    public synchronized void set(int valor) throws InterruptedException {
        System.err.println("Produtor Produziu " + valor);
        this.valor = valor;
    }

    @Override
    public synchronized int get() throws InterruptedException {
        System.err.println("Consumidor Consumiu " + valor);
        return valor;
    }
}
