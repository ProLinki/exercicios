package pacote_fora_do_estudo;

/**
 *
 * @author ProLinki
 */
public class Aluno {

    private Pessoa pessoa;
    private Materias materias;

    public Aluno() {
        this.pessoa = null;
        this.materias = null;
    }

    public Aluno(Pessoa pessoa) {
        super();
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }
}
