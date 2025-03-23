package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a =97;
		int b = 'a';
		
		System.out.println(a==b);
		System.out.println(3>4);
		System.out.println(3>=3);
		System.out.println(3<7);
		System.out.println(30<=7);
		System.out.println(30 !=7);
		
		double nota =9.3;
		boolean BomComportamento = false;
		boolean PassouPorMedia = nota>=7;
		
		boolean temDesonto = BomComportamento && PassouPorMedia;
		
		System.out.println("Tem desconto " + temDesonto);
	}

}
