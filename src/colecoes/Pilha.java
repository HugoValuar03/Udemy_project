package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.size());
		System.out.println(livros.isEmpty());
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.remove());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
	}
}
