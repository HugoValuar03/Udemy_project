package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas quer colocar:");
		Integer tamanho = entrada.nextInt();
		final double notas[] = new double[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite a nota: ");
			double nota = entrada.nextDouble();
			notas[tamanho] = nota;
		}
		
		System.out.println(Arrays.toString(notas));
	}
}
