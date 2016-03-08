package pratica;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ProLinki
 */
class Aluno {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Aluno() {
    }

    public Aluno(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        return this.getNome().hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        Aluno a = (Aluno) obj;
        return this.getNome().equals(a.getNome());
    }

    @Override
    public String toString() {
        return "Nome: ".concat(this.getNome()).concat("\nSobrenome: ").concat(this.getSobrenome()).concat("\nCPF: ").concat(this.getCpf());
    }
}

public class Begin {

    public static void main(String[] args) {
        Map<String, Aluno> mapa = new HashMap<>();
        Aluno a = new Aluno("Lucas", "Lima", "604");
        Aluno b = new Aluno("Leo", "Lima", "605");
        Aluno c = new Aluno("Ana", "Ferraz", "606");
        Aluno d = new Aluno("Ana", "Ferraz", "606");
        mapa.put(a.getNome(), a);
        mapa.put(b.getNome(), b);
        mapa.put(c.getNome(), c);
        mapa.put(d.getNome(), d);
        Collection<Aluno> aluno = mapa.values();
        for (Aluno al : aluno) {
            System.out.println(al);
        }

    }

}
