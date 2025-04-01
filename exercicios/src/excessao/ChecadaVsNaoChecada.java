package excessao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		geraErro1();
		
		
		geraErro2();
		
		System.out.println("Fim! :)");
	}
	//excessao não verificada 
	static void geraErro1() {
		throw new RuntimeException("Ocorrreu um erro bem lega!  #01!");
	}
	
	
	//excessao checada é necessario usar THROWS
	static void geraErro2() {
		new Exception("Ocorrreu um erro bem lega!  #02!");

	}
}
