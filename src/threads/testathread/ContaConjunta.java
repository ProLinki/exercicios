package threads.testathread;

/**
 *
 * @author ProLinki
 */
public class ContaConjunta {

    private int saldo = 100;

    public int getSaldo() {
        return saldo;
    }

    public synchronized void sacar(int valor, String cliente) {
        if (saldo >= valor) {
            int saldoOriginal = saldo;
            System.out.println("Cliente: " + cliente + "vai sacar.");
            try {
                Thread.sleep(1000);//aguardando processamento.
            } catch (InterruptedException ex) {
            }
            saldo -= valor;
            String msg = "Cliente ".concat(cliente).concat(" sacou R$ ").concat(valor + "").concat("[Saldo Original= " + saldoOriginal).concat(" Saldo Final= " + saldo+"]");
            System.out.println(msg);
        } else {
            System.out.println("Saldo insulficiente para " + cliente);
        }
    }
}
