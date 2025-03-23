package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int ajuste = 32;
		final double fator = 5.0/9;
		
		 double F = 86;
		 double C = (F - ajuste) * fator;
		 System.out.println("O resultado " + C + "C");
		
		F=150;
		C = (F - ajuste) * fator;
		System.out.println("O resultado " + C + "C");
		
		
		
		
	}

}
