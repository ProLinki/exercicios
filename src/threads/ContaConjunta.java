package threads;

/**
 * Essa classe irá simular uma conta compartilhada na qual um número de pessoa
 * porderá utilizada e realizar saques sempre que o saldo for permitido.
 *
 * @author ProLinki
 */
public class ContaConjunta {

    private Double saldo = 100.00;

    /**
     * Método responsável pelo saque.
     *
     * @param valorSaque
     * @param nomeCliente
     */
    public synchronized void sacar(double valorSaque, String nomeCliente) {
        if (this.getSaldo() >= valorSaque) {
            double saldoAtual = this.getSaldo();
            StringBuilder msg = new StringBuilder();
            try {
                Thread.sleep(1000);
                this.setSaldo(this.getSaldo() - valorSaque);
                msg.append("Cliente ").append(nomeCliente)
                        .append(" Sacou R$ ").append(valorSaque)
                        .append(" [Saldo Original: R$").append(saldoAtual)
                        .append(" Saldo Final: R$")
                        .append(this.getSaldo()).append(" ]");
                System.out.println(msg);
            } catch (InterruptedException ie) {
            }
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
