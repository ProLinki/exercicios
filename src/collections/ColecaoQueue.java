package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ProLinki
 */
public class ColecaoQueue {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Luca");
        fila.add("Ana");

        //Obs: tanto o método add() quanto o offer(), adicionam sempre na última posição.
        fila.add("Beatriz");
        fila.offer("Leo");
        System.out.println("Queue:       " + fila);

        //Traz o próximo elemento da fila
        String proximoElemento = fila.peek();
        System.out.println("Próximo:     [" + proximoElemento + "]");

        //Remove o elemento do inico da fila.
        fila.poll();
        System.out.println("Queue:       " + fila);

        /*Outros métodos disponiveis em LinkedList*/
        LinkedList<String> f = (LinkedList<String>) fila;
        //Adiciona no inicio da fila. 
        f.addFirst("Vania");
        //Adiciona no fim da fila.
        f.addLast("Henk");
        System.out.println("LinkedList:  " + f);

        //Traz o primeiro da fila.
        String primeira = f.peekFirst();
        //Traz o último da fila.
        String ultima = f.peekLast();
        System.out.println("Primeira:    [" + primeira + "]");
        System.out.println("Última:      [" + ultima + "]");

        //Remove a primeira da fila.
        f.pollFirst();
        //Remove a última da fila.
        f.pollLast();
        System.out.println("LinkedList:  " + f);
        //Adicionando todos do LinkedList.
        fila.addAll(f);
        System.out.println("Queue:       " + fila);
    }
}
