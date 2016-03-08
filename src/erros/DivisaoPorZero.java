package erros;

/**
 *
 * @author ProLinki
 */
public class DivisaoPorZero {

    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;
        int quociente = dividendo / divisor;
        /*Quando o valor do divisor é 0 então é lançado a exceção java.lang.ArithmeticException 
         parando a aplicação e informando que não é possível realizar a divisão por 0(by zero).*/
        System.out.println("Resultado: " + quociente);
    }
}
