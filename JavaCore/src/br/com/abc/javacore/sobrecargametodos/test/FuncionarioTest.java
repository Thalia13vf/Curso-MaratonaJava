package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Ana", "123.123.123.44", 4500, "123123-11");
		Funcionario funcionario2 = new Funcionario();
		
		funcionario.imprime();
		funcionario2.imprime();
	}
}	
