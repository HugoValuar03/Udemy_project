package stream.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import stream.filter.Aluno;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4 ,a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		System.out.println(alunos.stream()
				.allMatch(aprovado)); /*verifica se todos os alunos foram aprovados 
				de acordo com a condição do Predicate "aprovado" e retorna um boolean */
		
		System.out.println(alunos.stream()
				.anyMatch(aprovado)); /*verifica se algum dos alunos foram aprovados 
				de acordo com a condição do Predicate "aprovado" e retorna um boolean*/
		
		System.out.println(alunos.stream()
				.noneMatch(aprovado)); /*verifica se nenhum aluno foi aprovado 
				de acordo com a condição do Predicate "aprovado" e retorna um boolean*/
	}
}
