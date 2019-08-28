package br.com.abc.javacore.introducao.test;

import br.com.abc.javacore.introducao.classe.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante maria = new Estudante();
		maria.nome = "Maria";
		maria.matricula = "1213";
		maria.idade = 15;
		
		System.out.println(maria.nome);
		System.out.println(maria.matricula);
		System.out.println(maria.idade);
		
	}
}
