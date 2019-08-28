package br.com.abc.javacore.metodo.test;

import br.com.abc.javacore.metodo.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.cpf = "122.221.232-32";
		prof.matricula = "2131211";
		prof.nome = "Marcos";
		prof.rg = "1222211-3";
		
		Professor prof2 = new Professor();
		prof2.cpf = "222.342.134-33";
		prof2.matricula = "235247";
		prof2.nome = "Ana";
		prof2.rg = "2636336-3";

		prof.imprime();
		prof2.imprime();
		

	}

}
