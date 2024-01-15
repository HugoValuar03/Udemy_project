package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos na fila
		//o .add() lançará uma exceção caso a fila esteja cheia.
		//o .offer() retorna falso caso a fila esteja cheia.
		fila.add("Ana");
		fila.offer("João");
		fila.add("Bia");
		fila.offer("Carlos");
		fila.add("Hugo");
		fila.offer("Ariane");
		
		// Peek e element -> Obter próximo elemento da fila (sem remover)
		//diferença de comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek()); //retorna null se a fila estiver vazia
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lança uma exceção se a fila estiver vazia
		System.out.println(fila.element());
		
		// Poll e remove -> Obter próximo elemento da fila (removendo)
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma exceção
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
