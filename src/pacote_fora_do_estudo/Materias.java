package pacote_fora_do_estudo;

/**
 *
 * @author ProLinki
 */
public class Materias {

    private Matematica matematica;
    private Fisica fisica;

    public Materias() {
        this.setMatematica(null);
        this.setFisica(null);
    }

    public Materias(Matematica matematica, Fisica fisica) {
        this.setMatematica(matematica);
        this.setFisica(fisica);
    }

    public Matematica getMatematica() {
        return matematica;
    }

    private void setMatematica(Matematica matematica) {
        this.matematica = matematica;
    }

    public Fisica getFisica() {
        return fisica;
    }

    private void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public void verNotasGerais() {
        this.getMatematica().verNotas();
        this.getFisica().verNotas();
    }

}
