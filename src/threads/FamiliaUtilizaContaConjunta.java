package threads;

/**
 * Classe de teste, onde pessoa da familia irá a mesma conta com um único valor
 * de saldo para fazer as compras.
 *
 * @author ProLinki
 */
public class FamiliaUtilizaContaConjunta implements Runnable {

    private final ContaConjunta conta = new ContaConjunta();

    public static void main(String[] args) {
        FamiliaUtilizaContaConjunta irCompras = new FamiliaUtilizaContaConjunta();

        new Thread(irCompras, "Pai").start();
        new Thread(irCompras, "Mãe").start();
        new Thread(irCompras, "Filho").start();
        new Thread(irCompras, "Tio").start();
        new Thread(irCompras, "Avó").start();
    }
    
    /*Método que executa as Threads.*/
    @Override
    public void run() {
        String nomeCliente = Thread.currentThread().getName();
        for (int i = 0; i < 6; i++) {
            if (conta.getSaldo() <= 0) {
                System.out.println("Sem créditos.");
                break;
            } else {
                conta.sacar(20, nomeCliente);
            }
        }
    }
}
