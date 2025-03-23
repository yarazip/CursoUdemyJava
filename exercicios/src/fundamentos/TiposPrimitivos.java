package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionario
		
		//tipos numeriocs inteiros
		byte anosDeEmpresa= 23;
		short numeroDeVoos= 543;
		int id = 56789;
		long pontosAcumulados =2_234_845_223L;
		
		//tipos numerico reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias =false;
		
		//tipo caravtere
		char status = 'A'; //ativo
		
		//dias da empresa
		System.out.println(anosDeEmpresa *365);
		
		//numerp de viagens
		System.out.println(numeroDeVoos/2);
		
		//pontos e vendas acumuldados
		System.out.println(pontosAcumulados/ vendasAcumuladas);
		
		System.out.println(id + ": ganha " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		
		
		
		
		
	}

}
