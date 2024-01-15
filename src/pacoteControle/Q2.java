package pacoteControle;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano é bissexto");
		} else 
			System.out.println("O ano não é bissexto");
		
		entrada.close();
	}
}
