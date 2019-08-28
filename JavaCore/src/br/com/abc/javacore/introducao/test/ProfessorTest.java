package br.com.abc.javacore.introducao.test;

import br.com.abc.javacore.introducao.classe.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor p = new Professor();
		p.nome = "Ana";
		p.matricula = "3312";
		p.rg = "222.333.11-2";
		p.cpf = "239.003.000 - 12";
		
		Professor p2 = new Professor();
		p2.nome = "Maria";
		p2.cpf ="222.222.222 - 22";
		p2.rg = "222.333-6";
		p2.matricula = "3311";
		
		p = p2;
		
		System.out.println(p.nome);
		System.out.println(p.matricula);
		System.out.println(p.rg);
		System.out.println(p.cpf);
		System.out.println(p2.nome);
		System.out.println(p2.matricula);
		System.out.println(p2.rg);
		System.out.println(p2.cpf);

	}

}
