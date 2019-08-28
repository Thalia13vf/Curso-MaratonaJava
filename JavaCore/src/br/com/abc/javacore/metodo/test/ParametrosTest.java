package br.com.abc.javacore.metodo.test;

import br.com.abc.javacore.metodo.classes.Calculadora;

public class ParametrosTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int num1 = 5;
		int num2 = 10;
		calc.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro do teste");
		System.out.println("Num 1: " + num1); 
		System.out.println("Num 2: " + num2);
		//Quando o valor de uma variável de tipo primitivo for passado com argumento 
		//para um método, o valor da variável nunca é alterado
	}
}
