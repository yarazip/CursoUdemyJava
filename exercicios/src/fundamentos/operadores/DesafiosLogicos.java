package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {
		//TRABALHO DE TERÇA       //TRABALHO DE QUINTA
		boolean trabalho1 = true; 
		boolean trabalho2 = false;
		
		boolean comprouTv50= trabalho1 && trabalho2;
		boolean comprouTv32= trabalho1 ^ trabalho2;
		boolean comprouSorvete= trabalho1 || trabalho2;

		System.out.println("Comprou TV 50\"?" +comprouTv50);
		System.out.println("Comprou TV 32\"?" +comprouTv32);
		System.out.println("Comprou Sorvete\"?" +comprouSorvete);
		
		//operador unario
		System.out.println("Mais saudável\"?" +!comprouSorvete);


	}

}
