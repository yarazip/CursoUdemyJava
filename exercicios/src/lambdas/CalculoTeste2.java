package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo soma= (x, y)->{ return x+y; };
		
		System.out.println(soma.executar(2, 3));
		
//		calc = (x, y) -> x * y;
	}

}
