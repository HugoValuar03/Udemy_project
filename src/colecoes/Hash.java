package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Rafael"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
		
		// Necessário usar o hashcode:
		//	public int hashCode() {
		//		return super.hashCode();
		//	}
	 }
}
