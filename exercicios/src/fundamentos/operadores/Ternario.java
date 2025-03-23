package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media =3.6;
		String resultadoParcial= media>= 5.0 ? "em recuperacao" :"reprovado";
		String resultado = media >=7.0 ? "Aprovado": resultadoParcial;
		
		System.out.println("O aluno está: " +resultado);
		
		double nota =9.3;
		boolean BomComportamento = false;
		boolean PassouPorMedia = nota>=7;
		boolean temDesconto = BomComportamento && PassouPorMedia;
		String resultados = temDesconto ? "sim" : "não";
		System.out.println("Tem desconto? " + resultados);
		
//		System.out.println("Tem desconto " + temDesonto);
		
	}

}
