package excessoes;

/**
 * Essa classe representa uma Excessão.
 *
 * @author ProLinki
 */
public class CPFException extends Exception {

    private final String message = "CPF inválido.";

    public CPFException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }
}