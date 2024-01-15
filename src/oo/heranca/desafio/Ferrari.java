package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	
	@Override
	void freiar() {
		if(velocidadeAtual >= 15) {
			velocidadeAtual -= 15;
		}
	}
	
}
