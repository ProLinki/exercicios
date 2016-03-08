package rede;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author ProLinki
 */
public class ChatCliente extends JFrame {

    /*Atributo é usado para exibir o texto que será recebido do servidor.*/
    private final JTextArea textoRecebido;
    
    /*Atributo responsável pela entrada do texto que será enviado.*/
    private final TextField textoEnviar;
    
    /*Atributo responsável por criar uma conexão com o servidor.*/
    private Socket socket;
    
    /*Atributo responsável por armazenar o conteúdo que será enviado aoservidor.*/
    private PrintWriter escritor;
    
    /*Atributo responsável por armazenar o nome do usuário.*/
    private String nome;
    
    /*Atributo responsável por armazenar o conteúdo vindo do servidor.*/
    private Scanner leitor;

    /**
     * Construtor da classe <b>ChatCliente</b> que cria a tela do chat e invoca o método<i>configurarRede()</i> para configurar a Rede.
     *
     * @param nome
     * @throws Exception
     */
    public ChatCliente(String nome) throws Exception {
        super("Chat " + nome);
        this.nome = nome;

        Font font = new Font("Serif", Font.PLAIN, 26);
        this.textoEnviar = new TextField();
        this.textoEnviar.setFont(font);
        JButton botao = new JButton("Enivar");
        botao.setFont(font);
        botao.addActionListener(new ActionListenerEnviar());

        Container c = new JPanel();
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.CENTER, this.textoEnviar);
        c.add(BorderLayout.EAST, botao);

        this.textoRecebido = new JTextArea();
        this.textoRecebido.setFont(font);
        this.textoRecebido.setEditable(false);
        JScrollPane scroll = new JScrollPane(textoRecebido);

        super.getContentPane().add(BorderLayout.CENTER, scroll);
        super.getContentPane().add(BorderLayout.SOUTH, c);

        this.configurarRede();

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500, 400);
        super.setVisible(true);
    }

    /**
     * Método que faz a configuração da rede.
     *
     * @throws Exception
     */
    private void configurarRede() throws Exception {
        try {
            this.socket = new Socket("127.0.0.1", 5001);
            this.escritor = new PrintWriter(socket.getOutputStream());
            this.leitor = new Scanner(socket.getInputStream());
            new Thread(new EscutaServidor()) {
            }.start();
        } catch (Exception e) {

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Socket getSocket() {
        return socket;
    }

    private void setSocket(Socket socket) {
        this.socket = socket;
    }

    private PrintWriter getEscrito() {
        return escritor;
    }

    private void setEscrito(PrintWriter escrito) {
        this.escritor = escrito;
    }

    /**
     *
     * Classe <b>ActionListenerEnviar</b>que escuta o botão enviar.
     */
    private class ActionListenerEnviar implements ActionListener {

        /**
         * Envia a mensagem para o servidor.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            escritor.println(nome + " : " + textoEnviar.getText());
            escritor.flush();
            textoEnviar.setText("");
            textoEnviar.requestFocus();
        }
    }

    /**
     * Classe <b>EscutaServidor</b>que escuta o servidor.
     */
    private class EscutaServidor implements Runnable {

        /**
         * Recebe a mensagem vinda do servidor e exibe no <b>JTextArea</b>.
         */
        @Override
        public void run() {
            String texto;
            while ((texto = leitor.nextLine()) != null) {
                textoRecebido.append(texto.concat("\n"));
            }
        }
    }
}
