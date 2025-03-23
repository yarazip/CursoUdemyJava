package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	//acertei
	
	System.out.println("Digite o primeiro salário: "); 
	String valor1 = entrada.next().replace(",",".");	//acertei paricialmete 
	
	System.out.println("Digite o segundo salário: ");
	String valor2 = entrada.next().replace(",",".");	
	
	System.out.println("Digite o terceiro salário: ");
	String valor3 = entrada.next().replace(",",".");	 
		

	double salario1 = Double.parseDouble(valor1);
	double salario2 = Double.parseDouble(valor2);
	double salario3 = Double.parseDouble(valor3);

	double soma= (salario1+salario2+salario3);
	Double media= (salario1+salario2+salario3)/3;

	
	System.out.println("A soma é : "+ soma);
	System.out.println("A média é " + soma/media);
		
	
	entrada.close();
	
	}

}
