package threads.testathread;

/**
 *
 * @author ProLinki
 */
public class ComprasEmFamilia implements Runnable {

    private ContaConjunta contaConjunta = new ContaConjunta();

    public static void main(String[] args) {
        ComprasEmFamilia irAsCompras = new ComprasEmFamilia();

        new Thread(irAsCompras, "Pai").start();
        new Thread(irAsCompras, "Mãe").start();
        new Thread(irAsCompras, "Filha").start();
        new Thread(irAsCompras, "Filho").start();
        new Thread(irAsCompras, "Irmão").start();
    }

    @Override
    public void run() {
        String cliente = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            contaConjunta.sacar(20, cliente);
            if (contaConjunta.getSaldo() < 0) {
                System.out.println("Estoutou.");
            }
        }
    }
}
