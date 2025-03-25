package classe;

public class Produto {
	//ESSSAS TRÊS VARIAVEIS PERTENCEM A UM OBJETO
	String nome;
	double preco;
	static double desconto= 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome= nomeInicial;
		preco= precoInicial;
		desconto= descontoInicial;			
	}
	
	double precoComDesconto() {
		return preco * (1- desconto);
	}
//	double precoComDesconto (/**double descontoGerente*/) {
//		return preco *(1- desconto /**+ descontoGerente*/);
//	}
}
