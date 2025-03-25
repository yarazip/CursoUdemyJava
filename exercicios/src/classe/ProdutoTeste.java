package classe;

//MEMBRO ATRIBUTO OU COMPORTAMENTO
//A CLASSSE DEFINE UM TIPO
//VARIAVEIS DO TIPO PRODUTO
//P1 E P2 INSTANCIA
public class ProdutoTeste {
	 public static void main(String[] args) { 
		 //	ATRIBUTOS NOME, PREÇO E DESCONTO
		Produto p1 =new Produto("Notebook", 4356.89, 0);
//		p1.nome ="Notebook";
//		p1.preco = 4356.89;
//		p1.desconto= 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco=12.56;
		
		
		Produto.desconto= 0.50;
		
		System.out.println(p1.nome + "  " +p1.precoComDesconto());
		System.out.println(p1.nome + "  " +p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		
		System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho );
	}
}
