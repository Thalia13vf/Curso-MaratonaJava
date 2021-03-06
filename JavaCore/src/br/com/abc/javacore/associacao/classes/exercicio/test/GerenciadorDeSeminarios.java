package br.com.abc.javacore.associacao.classes.exercicio.test;

import br.com.abc.javacore.associacao.classes.exercicio.Aluno;
import br.com.abc.javacore.associacao.classes.exercicio.Local;
import br.com.abc.javacore.associacao.classes.exercicio.Professor;
import br.com.abc.javacore.associacao.classes.exercicio.Seminario;

public class GerenciadorDeSeminarios {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 21);
		Aluno aluno2 = new Aluno("Joana", 22);
		
		Seminario s = new Seminario("Como ser um programador");
		Professor prof = new Professor("Jos�", "front-end");
		Local local = new Local("Rua das Araras", "Jardim");
		
		aluno1.setSeminario(s);
		aluno2.setSeminario(s);
		
		s.setProfessor(prof);
		s.setLocal(local);
		s.setAlunos(new Aluno[] {aluno1, aluno2});
		
		prof.setSeminarios(new Seminario[] {s});
		
		s.print();
		prof.print();
		
	}
}
