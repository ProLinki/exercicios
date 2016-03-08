package anotacoes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Documented
public @interface Cabecalho {

    String instituicao();

    String nomeProjeto();

    String dataCriacao();
    
    String criador();

    int revisao() default 1;

}
