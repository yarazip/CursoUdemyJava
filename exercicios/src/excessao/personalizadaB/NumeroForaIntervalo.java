package excessao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends Exception {
	private String nomeDoAtributo;
	
	public NumeroForaIntervalo(String nomeDoAtributo) {
		this.nomeDoAtributo= nomeDoAtributo;
	}
		
		public String getMenssage() {
			return String.format("O atributo %s está vazio", nomeDoAtributo);
		
	}

}
