package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		//O Predicate é uma função que recebe um parâmetro e retorna um valor
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
		
		//Neste exemplo o Predicate está recebendo um parâmetro do tipo Produto e está retornando um valor do tipo boolean
	}
}
