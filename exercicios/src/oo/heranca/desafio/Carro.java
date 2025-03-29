package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected int delta=5;
	
	protected Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeAtual;
	}
	
	public void acelerar() {
		
		if(velocidadeAtual+delta >VELOCIDADE_MAXIMA) {
			velocidadeAtual=VELOCIDADE_MAXIMA;
		}else
		velocidadeAtual+=delta;
	}
	
	public void frear() {
		if (velocidadeAtual>=5) {
			velocidadeAtual-=5;
		}else {
			velocidadeAtual=0;
		}
	}
	public String toString() {
		return "Velocidade atual é "+velocidadeAtual;
	}
}
