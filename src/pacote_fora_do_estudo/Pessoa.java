package pacote_fora_do_estudo;

/**
 *
 * @author ProLinki
 */
public class Pessoa {

    private String nome;
    private String sobrenome;
    private Long matricula;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, Long matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the matricula
     */
    public Long getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
}
