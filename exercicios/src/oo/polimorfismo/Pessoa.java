package oo.polimorfismo;

public class Pessoa {
	public Pessoa (double peso) {
		setPeso(peso);
	}
	private double peso;
	
	
	public void comer(Comida comida) {
		this.peso+=comida.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso>=0) {
			this.peso = peso;
		}
	}
}
