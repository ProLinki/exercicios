package anotacoes;

import java.io.Serializable;

/**
 *
 * @author ProLinki
 * @since 21/01/2016
 *
 */
@Cabecalho(
        instituicao = "Estácio Fic",
        nomeProjeto = "Sistema Informativo",
        dataCriacao = "21/01/2016",
        criador = "Lucas Lima",
        revisao = 1
)

@ErrosCorrigidos(value = {"0001", "0002"})
@SuppressWarnings("serial")
public class TestandoAnotacao implements Serializable {

    /**
     * @SupressWarnings é uma notação que indica que algo não está sendo
     * utilizado.
     */
    @SuppressWarnings("unused")
    private String variavelNaoUtilizada;

    @Deprecated
    public void umMetodoSemUtilizacao() {
        /**
         * @Deprecated torna a classe, método ou variável em obsoleto.
         */
    }

    @Override
    public String toString() {
        /**
         * @Override informa que é um sobreescrita da classe pai.
         */
        return null;
    }
}
