package ExConceitosBasicosSecao4;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		//(0 °C × 9/5) + 32 = 32 °F
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double tempC =  temp.nextDouble();		
		double C = tempC;
		final double fator =(C * 9.0/5)+32;		 
		 
		 System.out.println("O resultado " + fator + "F");
		
		 temp.close();
		
	}	


}
