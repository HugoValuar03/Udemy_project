package pacoteControle;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O número é par e está entre 0 e 10");
			} else {
				System.out.println("O número é impar e está entre 0 e 10");
			}
		} else {
			System.out.println("O número informado não está dentro do intervalo desejado.");
		}
			
		entrada.close();
	}
}
