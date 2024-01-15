package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Hugo"));
		lista.add(new Usuario("Fernando"));
		lista.add(new Usuario("Higor"));
		lista.add(new Usuario("Pedro"));
		
		System.out.println(lista.get(1));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}
}
