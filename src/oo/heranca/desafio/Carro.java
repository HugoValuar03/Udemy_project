package oo.heranca.desafio;

public class Carro {

	double velocidadeAtual;
	
	void acelerar() {
		velocidadeAtual += 5;
	}
	
	void freiar() {
		if(velocidadeAtual >= 5) {			
			velocidadeAtual -= 5;
		}
	}

	@Override
	public String toString() {
		return "Sua velocidade atual é de " + velocidadeAtual + "Km/h";
	}
}
