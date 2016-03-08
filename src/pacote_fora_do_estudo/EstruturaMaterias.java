package pacote_fora_do_estudo;

/**
 *
 * @author ProLinki
 */
public class EstruturaMaterias implements Notas {

    private final Double[] notas = new Double[4];
    private String nomeMateria;
    private int posicaoProximaNota;

    public EstruturaMaterias() {
        this.posicaoProximaNota = 0;
    }

    @Override
    public void inserirNotas(Double nota) {
        if (this.validaEntradaDaNota()) {
            this.notas[this.posicaoProximaNota++] = nota;
        } else {
            System.out.println("Notas preenchidas.");
        }
    }

    @Override
    public void verNotas() {
        if (this.posicaoProximaNota == 0) {
            System.out.printf("Não há notas de %s.\n", this.getNomeMateria());
        } else {
            System.out.printf("Notas de %s\n", this.getNomeMateria());
            for (int i = 0; i < this.posicaoProximaNota; i++) {
                System.out.println((i + 1) + "° nota " + this.notas[i]);
            }
            System.out.println("-------------------------");
        }
    }

    public Boolean validaEntradaDaNota() {
        return this.posicaoProximaNota < this.notas.length;
    }

    private String getNomeMateria() {
        return this.nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    private void setPosicaoProximaNota(int posicaoProximaNota) {
        this.posicaoProximaNota = posicaoProximaNota;
    }
}
