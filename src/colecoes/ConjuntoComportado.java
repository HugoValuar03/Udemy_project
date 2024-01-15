package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Hugo");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		Set<Integer> nums = new HashSet<>();
		nums.add(4);
		nums.add(10);
		nums.add(32);
		nums.add(44);
		
		for(Integer candidato: nums) {
			System.out.println(candidato);
		}
	}
}
