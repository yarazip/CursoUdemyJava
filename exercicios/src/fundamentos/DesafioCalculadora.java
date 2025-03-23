package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//ler num1
		//ler num2
		Scanner calculadora = new Scanner(System.in);
		System.out.println("Digite um número");
		double num1 = calculadora.nextDouble();
		
		System.out.println("Digite outro número");
		double num2 = calculadora.nextDouble();
		
		System.out.println("Digite a operação");
		String ope = calculadora.next();
		
		
		//lógica
		double resultado = "+".equals(ope) ? num1+ num2: 0;
		resultado = "-".equals(ope) ? num1- num2: resultado;
		resultado = "*".equals(ope) ? num1* num2: resultado;
		resultado = "/".equals(ope) ? num1/ num2: resultado;
		resultado = "%".equals(ope) ? num1% num2: resultado;

		
		System.out.printf("%.2f %s %.2f  = %.2f ", num1, ope, num2, resultado );

		
		calculadora.close();
	}

}
