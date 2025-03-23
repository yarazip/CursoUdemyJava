package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		//AND
		boolean condicao1= true;
		boolean condicao2= 3>7;
		System.out.println(condicao1&&!condicao2);
		
		//OU
		System.out.println(condicao1||condicao2);
		System.out.println(condicao1^condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("TABELA VERDADE AND");
		System.out.println(true&&true);
		System.out.println(true&&false);
//		System.out.println(false&&true);
//		System.out.println(false&&false);
		
		System.out.println("TABELA VERDADE OR");
//		System.out.println(true||true);
//		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("TABELA VERDADE XOR");
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println("TABELA VERDADE NOT ELE É UNÁRIO");
		System.out.println(!true);
		System.out.println(!false);
	
		
	}

}
