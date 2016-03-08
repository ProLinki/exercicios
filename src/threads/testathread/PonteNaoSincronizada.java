package threads.testathread;

/**
 *
 * @author ProLinki
 */
public class PonteNaoSincronizada implements Ponte {

    private int valor = -1;

    @Override
    public void set(int valor) throws InterruptedException {
        System.out.println("Produtor Produziu " + valor);
        this.valor = valor;
    }

    @Override
    public int get() throws InterruptedException {
        System.err.println("Consumidor Consumiu " + valor);
        return this.valor;
    }

}
