package classe;

public class Produto {
	
	String nome;
	Double preco;
	static Double desconto = 0.25;
	
	Produto(String nomeInicial, Double precoInicial){
	
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	double descontoDoProduto() {

		double descontoTotal = preco - (preco*desconto);
		
		return descontoTotal;
	}
}
