package classes;

/**
 *
 * @author ProLinki
 */
public abstract class ClasseAbstrata {
    /*Diferente de um interface, uma classe abstrata pode conter métodos concretos, 
     quanto atributos.
     */

    /*Ambas os métodos serão obrigatoriamente 
     inseridos nas class que estendem esta classe abstrata.*/
    public abstract void fazNadaAbstrato();

    /*Exemplo de método concreto. Obs: métodos concretos não são obrigatorios quando uma classe
     estende de uma classe Abstrata.*/
    public void fazNadaAbstrato(Double i) {
        System.out.println("Double i " + i);
    }

    /*Variáveis e seus getters and setters*/
    public int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
