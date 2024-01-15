package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		// É uma função que recebe um único parâmetro e não retorna nada
		
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		/*É o método accept que vai passar o produto que foi criado
		*Em outras palavras, recebe um único parâmetro e não retorna nada
		*/
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lápis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		System.out.println();
		//Para cada p de produto, imprima o preço
		produtos.forEach(System.out::println);
		
	}
}
