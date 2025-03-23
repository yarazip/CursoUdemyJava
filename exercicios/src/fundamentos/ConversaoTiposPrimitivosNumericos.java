package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a =1; //CONVERSAO IMPLICITA, DOUBLE MAIOR QUE INT E ARAMZENA PONTO FLUTUANTE
		System.out.println(a);
		
		float b = 1.0F; //O LITERAL E DO TIPO DOUBLE ENTÃO PRECISA DO F OU DO CAST
		System.out.println(b);
		
		float bc =  (float)1.0; //CAST
		System.out.println(bc); 
		
		int c =128;
		byte d = (byte)c; //conversa´explicita
		System.out.println(d);
		
		double e= 1.999999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
