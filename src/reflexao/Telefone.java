package reflexao;

import java.util.Map;

/**
 *
 * @author ProLinki
 */
public class Telefone {
    
    private String codigoPais;
    private String operadora;
    
    public Telefone() {
    }
    
    public Telefone(String codigoPais, String operadora) {
        this.codigoPais = codigoPais;
        this.operadora = operadora;
    }

    @NomePropriedade("códigoInternacional")
    public String getCodigoPais() {
        return codigoPais;
    }
    
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Ignorar
    public String getOperadora() {
        return operadora;
    }
    
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public static void main(String[] args) {
        Telefone t = new Telefone("+55", "TIM");
        
        Map<String, Object> props = GeradorMapa.gerarMapa(t);
        for (String prop : props.keySet()) {
            System.out.println(prop + " = " + props.get(prop));
        }
    }
}
