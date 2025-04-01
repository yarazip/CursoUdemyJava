package excessao.personalizadaB;
import excessao.Aluno;
public class Validar {

	private Validar() {}
		public static void aluno (Aluno aluno) 
				throws NumeroForaIntervalo, NumberFormatException{
			 
			if (aluno==null) {
				throw new IllegalArgumentException("O aluno está nulo");
			}
			
			if(aluno.nome ==null||aluno.nome.trim().isEmpty()) {
				throw new NumeroForaIntervalo("nome");
			}
			if(aluno.nota<0 || aluno.nota>10) {
				throw new NumberFormatException("nota");
			}
		}
}
