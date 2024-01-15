package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
			
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 5, 2);
		compra1.adicionarItem(new Produto("Notebook", 2300), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 20, 5);
		compra2.adicionarItem(new Produto("Impressora", 3000), 2);
		
		Cliente cliente = new Cliente("Maria Julia");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		System.out.println(cliente.obterValorTotal());
	}
}
