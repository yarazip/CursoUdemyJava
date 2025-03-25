package ExConceitosBasicosSecao4;

import java.util.Scanner;

public class FarenheitToCelcius {
	
	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double tempF =  temp.nextDouble();
		
		
	
		final int ajuste = 32;
		final double fator = 5.0/9;
		
		 double F = tempF;
		 double C = (F - ajuste) * fator;
		 System.out.println("O resultado " + C + "C");
		
		 temp.close();
		
	}	

}
