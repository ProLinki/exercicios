package reflexao;

import java.util.Map;

/**
 *
 * @author ProLinki
 */
public class Produto {

    private String nome;
    private String categoria;
    private Double preco;
    private String descricao;

    public Produto() {
    }

    public Produto(String nome, String categoria, Double preco, String descricao) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.descricao = descricao;
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
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static void main(String[] args) {
        Produto p = new Produto("Design Patterns", "LIVRO", 59.90,
                "Publicado pela Casa do Codigo");
        
        Map<String, Object> props = GeradorMapa.gerarMapa(p);
        for (String prop : props.keySet()) {
            System.out.println(prop+" = "+props.get(prop));
        }        
    }
}
