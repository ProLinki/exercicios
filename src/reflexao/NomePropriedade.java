package reflexao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author ProLinki
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface NomePropriedade {
    String value();
}
