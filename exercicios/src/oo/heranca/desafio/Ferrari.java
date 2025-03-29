package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
//	@Override
//	public void acelerar() {
//		velocidadeAtual+=15;
//	}
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta=350;
	}
	@Override
	public void ligarTurbo() {
		delta=35;
	}
	@Override
	public void desligarTurbo() {
		delta=15;
	}
	
}
