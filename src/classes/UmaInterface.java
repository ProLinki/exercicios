package classes;

/**
 *
 * @author ProLinki
 */
public interface UmaInterface {

    /*Uma interface não pode conter métodos concretos e também não pode ter atributos vázios.*/

    /*Forma correta de declaração de métodos*/
    public abstract void fazNadaInterface();

    /*Forma incorreta*/
    //public abstract void fazNadaInterface(){}
    /*Obs: É possível faz sobrecarga de métodos.*/
    public abstract void fazNadaInterface(double i);

    /*Obs: Como teste não é possível inserir atributos vázios.*/
    //int a;

    /*Abtributos não vázio.*/
    Integer i = 0;
    String text = "Hello";
    Boolean ok = true;
    Character a = 'A';
    Short s = 32000;
    Byte b = 127;

}
