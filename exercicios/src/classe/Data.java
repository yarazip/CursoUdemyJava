package classe;

public class Data {
	//atributos
	int dia;
	int mes;
	int ano;
	
	Data(){
//		dia =01;
//		mes =01;
//		ano =1970;
		this(1, 1, 1970);
		
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		this.dia =diaInicial;
		this.mes =mesInicial;
		this.ano =anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d",this.dia, mes, ano);
	}
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}
