package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	//NÃO CONVERTE: int ->Double
	Double a =1.0;
	
	
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x, y)->{ return x+y; };
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y)-> x* y;
		System.out.println(calc.apply(2.0, 3.0));
		
	}
}
