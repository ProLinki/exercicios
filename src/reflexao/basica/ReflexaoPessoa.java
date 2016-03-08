package reflexao.basica;

import java.lang.reflect.Field;

/**
 *
 * @author ProLinki
 */
public class ReflexaoPessoa {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        /*Criar um objeto do tipo Pessoa.*/
        Pessoa pessoa = new Pessoa();
        /*Pegando a classe, para observar utlizar e/ou utilizar seu atributos e métodos.*/
        Class<?> classe = pessoa.getClass();
        /*Pessoa todos campos declarados.*/
        Field[] fieldName = classe.getDeclaredFields();
        /*Acessando cada índice e verificando se corresponde ao campo nome.*/
        for (Field f : fieldName) {
            /*Caso verdadeiro, atribui acesso ao campo e seta um valor passando como parametro 
            o objeto e o valor a ser inserido.*/
            if (f.getName().equals("nome")) {
                f.setAccessible(true);
                f.set(pessoa, "Lucas");
            }
        }
        System.out.println(pessoa.getNome());
    }
}