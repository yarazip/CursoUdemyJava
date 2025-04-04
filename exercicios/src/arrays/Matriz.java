package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdAlunos=entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdNotas=entrada.nextInt();
		
		double [][] notasDaTurma = new double [qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int a=0; a<notasDaTurma.length;a++) {
			for (int n=0; n <notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ",n,a);
				notasDaTurma[a][n]= entrada.nextDouble();
				total += notasDaTurma [a][n];				
			}
		}
		double media = total/(qtdAlunos* qtdNotas);
		System.out.println("A média da turma é: "+media);
		for(double [] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDaTurma));
		}
		entrada.close();
	}
}
