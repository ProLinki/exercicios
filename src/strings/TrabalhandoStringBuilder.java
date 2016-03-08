package strings;

/**
 *
 * @author ProLinki
 */
public class TrabalhandoStringBuilder {

    /*Obs: A classe StringBuffer é considerada uma “classe sincronizada”, ou seja, possui seus métodos sincronizados (somente uma Thread pode acessar por vez).*/
    public static void main(String[] args) {
        /*A classe StringBuffer, por sua vez, é indicada para aplicações que envolvem utilização de várias linhas de execução simultâneas (threads), como sistemas Web.*/

        String tabela = "funcionario";
        String orderBy = " ORDER BY nome";
        StringBuilder sql = new StringBuilder("SELECT cpf, nome ");
        sql.append("FROM ");
        sql.append(tabela);
        sql.append(" WHERE sexo = 'M'").append(orderBy);

    }
}
