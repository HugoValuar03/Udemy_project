package pacoteControle;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Digite a nota");
			double nota = entrada.nextDouble();
			total = total + nota;
			
		}
		total = total/2;
		System.out.println("Sua média é: " + total);
		
		if(total >= 7) {
			System.out.println("Aprovado");
		}
		
		if(total > 4 && total < 7) {
			System.out.println("Recuperação");
		} else if(total <= 4)
			System.out.println("Reprovado");
		entrada.close();
		
	}
}
