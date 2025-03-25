package controle;

import java.util.Scanner;

public class DesafioDoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int qtdDeNotas = 0 ;
		double nota=0;
		double total=0;
		
		while (nota !=-1) {
			System.out.println("Informe a nota (ou digite -1 para sair)");
			nota= entrada.nextDouble();
			
			if (nota <= 10 && nota >=0) {
				total +=nota;
				qtdDeNotas++;
			}else if (nota !=-1) {
				System.out.println("Nota inválida!");
			}
		}
		
	//Calcular a média
		double media = total/qtdDeNotas;
		System.out.println("Média= " + media);
		
		entrada.close();
		
	}

}
