package pacoteControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		double total = 0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número de notas desejadas: ");
		int quantNotas = entrada.nextInt();
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		while(quantNotas > 0) {
			System.out.print("Digite a nota: ");
			int nota = entrada.nextInt();
			if (nota < 0 || nota > 10) {
				System.out.println("Escreva uma nota válida");
				quantNotas++;
			}
			quantNotas--;
			contador++;
			total = total + nota;	
		}
		
		total = total/contador;
		System.out.println(total);
		entrada.close();
	}
}
