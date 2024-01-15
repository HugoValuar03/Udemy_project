package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		/* O BinaryOperator representa uma operação que recebe dois operandos do 
		 * mesmo tipo e produz um resultado do mesmo tipo dos operandos
		 */
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		
		System.out.println(calc.apply(2.0, 3.0));
		/* O java não permite a conversão de int -> Double,
		 * por isso é necessário colocar casas decimais
		 */
		
		calc = (x, y) -> x*y;
		
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		calc = (x, y) -> x*y;
		
		System.out.println(calc2.apply(2, 3));
		
	}
}
