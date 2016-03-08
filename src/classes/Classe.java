package classes;

/**
 *
 * @author ProLinki
 */
public class Classe extends ClasseAbstrata implements UmaInterface{

    /*
     Uma Classe Serve como modelo, ou seja, representa as abstrações do Objeto.
     */
    
    /*Obs: Esta classe esta servindo de teste para estender de uma classe abstrata e 
     implementar de uma interface.*/
    @Override
    public void fazNadaAbstrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fazNadaAbstrato(Double i){
        
    }
    
    @Override
    public void fazNadaInterface(double i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fazNadaInterface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
