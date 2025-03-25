package controle;

public class DesafioFor {
	public static void main(String[] args) {
		//ESCREVER O SEGUINTE CÓDIOGO SEM VALOR NÚMÉRICO
		String valor = "#";
		for(int i =1 ; i<=5; i++) {
			System.out.println(valor);
			valor +="#";
		}
		//SOLUÇÃO
		for (String v ="#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
	}

}
