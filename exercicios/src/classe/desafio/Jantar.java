package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida ("Arroz", 0.183);
		Comida c2 = new Comida ("Feijão", 0.300);
		
		Pessoa p = new Pessoa ("João", 99.0);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
	}
}
