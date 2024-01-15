package classe;

import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Produto p1 = new Produto("Notebook", 2500.5);		
		System.out.println(p1.nome);
		System.out.println("O produto ficou de " + p1.preco + " por " + p1.descontoDoProduto());
	
		entrada.close();
	}
}
