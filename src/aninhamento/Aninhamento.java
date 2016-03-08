package aninhamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ProLinki
 */
@SuppressWarnings("serial")
public class Aninhamento extends JFrame {

    private final JButton btnOk;

    public Aninhamento() {
        super("Aninhamento");

        this.btnOk = new JButton("OK");
        this.btnOk.addActionListener(new OkListener());

        this.btnOk.addActionListener((ActionEvent e) -> {
            System.out.println("Classe anonima processa " + btnOk.getText());
        });

        getContentPane().add(this.btnOk);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    /*Exemplo de classe aninhada.*/
    /*O aninhamento permite colocar classes dentro de classes, 
     porém só pode existir uma única classe concreta com o modificador de acesso public.*/
    private class OkListener implements ActionListener {
        
        /*Exemplo de método anonimo.*/
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Classe aninhada processa: " + btnOk.getText());
        }
    }

    public static void main(String[] args) {
        Aninhamento janela = new Aninhamento();

    }
}
