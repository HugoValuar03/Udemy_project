package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(3, 5));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(3, 5));
	}
}
