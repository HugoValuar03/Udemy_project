package stream;

import java.util.function.UnaryOperator;

public class Ultilitarios {
	
	public Ultilitarios() {
		
	}

	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> grito = n -> n + "!!! ";
}
