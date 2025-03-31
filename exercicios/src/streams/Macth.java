package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Macth {
	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Ana", 7.8);
		Aluno a2 = new Aluno ("Bia", 5.8);
		Aluno a3 = new Aluno ("Lia", 9.8);
		Aluno a4 = new Aluno ("Teo", 6.8);
		
		List<Aluno> alunos= Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Predicate<Aluno> reprovado = aprovado.negate();

		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(reprovado));
		System.out.println(alunos.stream().noneMatch(aprovado));
		

	}
}
