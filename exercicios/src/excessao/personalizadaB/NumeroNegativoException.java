package excessao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception {
	private String nomeDoAtributo;
	
	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo= nomeDoAtributo;
	}
		
		public String getMenssage() {
			return String.format("O atributo %s está negativo", nomeDoAtributo);
		
	}

}
