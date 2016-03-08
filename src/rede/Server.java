package rede;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe <b>Server</b> responsável por criar o servidor do chat e gerenciar o
 * redirecionamento das mensagens.
 *
 * @author ProLinki
 */
public class Server {

    /*Atributo do tipo <b>ServerSocket</b> responsável por criar o servidor.*/
    private ServerSocket server;
    
    /*Atributo do tipo <b>List</b> que tem como parametro um objeto do tipo <b>PrintWriter</b> que armazena todos os textos.*/
    private List<PrintWriter> escritores = new ArrayList<>();

    /**
     * Cnstrutor da classe <b>Server</b> que cria e inicializa o servidor e
     * recebe as mensagens vindas da classe <b>ChatCliente</b>.
     *
     * @throws Exception
     */
    public Server() throws Exception {
        try {
            this.server = new ServerSocket(5001);
        } catch (Exception e) {
        }
        while (true) {
            Socket socket = server.accept();
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            this.escritores.add(pw);
            new Thread(new EscutaCliente(socket)) {
            }.start();
        }
    }

    /**
     * Classe <b>EscutaCliente</b> responsável por escutar cada cliente do chat.
     */
    private class EscutaCliente implements Runnable {

        /**
         * Atributo do tipo <b>Scanner</b> que é responsável captura das
         * mensagens vindas do usuário no chat pra que seja adicionada na lista.
         */
        private Scanner leitor;

        /**
         * Construtor <b>EscutaCliente</b> tem um atributo do tipo <b>Socket</b>
         * como entrada, para capturar o texto digitado vindo da classe
         * <b>ChatCliente</b>.
         *
         * @param socket
         */
        public EscutaCliente(Socket socket) {
            try {
                this.leitor = new Scanner(socket.getInputStream());
            } catch (Exception e) {
            }
        }

        @Override
        public void run() {
            try {
                String texto;
                while ((texto = leitor.nextLine()) != null) {
                    encaminharParaTodos(texto);
                }
            } catch (Exception e) {
            }
        }
    }

    private void encaminharParaTodos(String texto) {
        for (PrintWriter w : escritores) {
            try {
                w.println(texto);
                w.flush();
            } catch (Exception e) {
            }
        }
    }

    private ServerSocket getServer() {
        return server;
    }

    private void setServer(ServerSocket server) {
        this.server = server;
    }

    public static void main(String[] args) throws Exception {
        Server server1 = new Server();
    }
}
