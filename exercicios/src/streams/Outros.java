package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Ana", 7.8);
		Aluno a2 = new Aluno ("Bia", 5.8);
		Aluno a3 = new Aluno ("Lia", 2.8);
		Aluno a4 = new Aluno ("Teo", 4.8);
		Aluno a5 = new Aluno ("Gabi", 7.8);
		Aluno a6 = new Aluno ("Yara", 8.8);
		Aluno a7 = new Aluno ("Mia", 10.0);
		Aluno a8 = new Aluno ("Manu", 6.8);
		Aluno a9 = new Aluno ("Ana", 7.8);
		Aluno a10 = new Aluno ("Bia", 5.8);
		Aluno a11= new Aluno ("Lia", 9.8);
		Aluno a12= new Aluno ("Teo", 6.8);
		
		
		List<Aluno> alunos= Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.takeWhile(a-> a.nota>=7)
		.forEach(System.out::println);

	}
}
