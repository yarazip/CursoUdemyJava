package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		String valor= "";
		
		//enquanto não digitar SAIR Você diz:
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
		
	}

}
