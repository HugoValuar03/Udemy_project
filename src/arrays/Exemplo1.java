package arrays;

import java.util.Arrays;

public class Exemplo1 {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 2;
		notasAlunoA[1] = 5;
		notasAlunoA[2] = 8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(" ");
		
		double total = 0;
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("A média é: " + total / notasAlunoA.length);
		System.out.println(" ");
		double[] notasAlunoB = {2, 4, 6};
		
		System.out.println(Arrays.toString(notasAlunoB));
		double media = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			media += notasAlunoB[i];
		}
		
		System.out.println("A média é: " + media / notasAlunoB.length);
		
		
	}
}
