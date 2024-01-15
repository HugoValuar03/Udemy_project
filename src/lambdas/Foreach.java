package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		//Definindo uma lista
		
		System.out.println("Forma Tradicional...");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		//Forma tradicional de Foreach
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println("Meu nome é: " + nome));
		//Para cada elemento da lista, escreva o elemento + "!!!"
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);	
		//Para cada aprovado, chame o sysout.out.println, ou seja, imprima na saida do sistema
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		//Para cada nome de aprovados, chame o método meuImprimir
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);	
		/*Para cada aprovado, chame a função Foreach::meuImprimir, 
		 * passando cada um dos elementos como paramêtro para meuImprimir
		 */
	}

	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome );
	}
}
