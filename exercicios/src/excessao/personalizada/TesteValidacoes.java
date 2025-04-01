package excessao.personalizada;
import excessao.Aluno;
public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("Ana", -7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			
		}catch (NumeroForaIntervalo
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim1:)");
	}
}
