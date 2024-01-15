package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Escreva o primeiro número: ");
		double numero1 = entrada.nextDouble();
		
		System.out.print("Escreva o segundo número: ");
		double numero2 = entrada.nextDouble();
		
		System.out.print("Informe a operação: ");
		String op = entrada.next();
		
		System.out.printf(numero1 + " " + op + " " + numero2);
		if(op.equals("+")) {
			System.out.println();
			System.out.println(numero1+numero2);
		} else if(op.equals("-")) {
			System.out.println();
			System.out.println(numero1-numero2);
		} else if(op.equals("*")) {
			System.out.println();
			System.out.println(numero1*numero2);
		} else if(op.equals("/")) {
			System.out.println();
			System.out.println(numero1/numero2);
		}
		
		
		
		entrada.close();
	}
}
