package excessao.personalizada;

@SuppressWarnings("serial")
public class NumeroForaIntervalo extends RuntimeException {
	private String nomeDoAtributo;
	
	public NumeroForaIntervalo(String nomeDoAtributo) {
		this.nomeDoAtributo= nomeDoAtributo;
	}
		
		public String getMenssage() {
			return String.format("O atributo %s está vazio", nomeDoAtributo);
		
	}

}
