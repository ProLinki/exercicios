/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author ProLinki
 */
public class ClasseFilho extends ClassePai {

    private String nom = "xxx";

    @Override
    public String toString() {
        return super.toString().concat(this.nom); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        ClassePai filho = new ClasseFilho();
        System.out.println(filho.toString());
    }
}
