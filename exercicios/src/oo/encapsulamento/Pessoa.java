package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, int idade) {
		setIdade(idade);
		setNome(nome);
	}
	
	

	//Getter
	public int getIdade() {
		return idade;
	}
	
	//Setter
	public void setIdade(int novaIdade) {
		novaIdade= Math.abs(novaIdade);
		if (novaIdade>=0 && novaIdade<=120) {
			this.idade=novaIdade;
			
		}
	}
	@Override
	public String toString() {
		return "Olá eu sou o "+ getNome()+ getSobrenome()+ "tenho " +getIdade() + " anos";
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

}
