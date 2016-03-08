package excessoes;

/**
 * A classe <b>Operacao</b> é uma classe que contém um método que formata um cpf
 * que sejá válido, caso contrário é invocado uma excessão.
 *
 * @author ProLinki
 */
public class Operacao {

    private static StringBuilder builder;

    public static StringBuilder validaCPF(String cpf) {
        builder = new StringBuilder();
        if (cpf.length() == 11) {
            builder.append(cpf)
                    .insert(3, ".")
                    .insert(7, ".")
                    .insert(11, "-");
            return builder;
        } else {
            return builder.append(new CPFException().getMessage());
        }
    }
}
