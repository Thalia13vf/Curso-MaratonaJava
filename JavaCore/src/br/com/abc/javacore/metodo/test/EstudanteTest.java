package br.com.abc.javacore.metodo.test;

import br.com.abc.javacore.metodo.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante e = new Estudante();
		e.setNome("Maria");
		e.setIdade(-146);
		e.setNotas(new double[]{9.2, 4.2, 6});
	
		e.imprime();
		
	}
}
