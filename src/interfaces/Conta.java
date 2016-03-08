package interfaces;

/**
 *
 * @author ProLinki
 */
public class Conta {

    private String cliente;
    private Double saldo;

    public Conta() {
    }

    public Conta(String cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
