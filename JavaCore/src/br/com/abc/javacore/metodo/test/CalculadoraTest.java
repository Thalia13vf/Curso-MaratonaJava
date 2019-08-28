package br.com.abc.javacore.metodo.test;

import br.com.abc.javacore.metodo.classes.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(55.5, 5);
		
		double resultado = calc.divideDoisNumeros(20, 5);
		System.out.println(resultado);
		System.out.println("Imprime dois números divididos");
		calc.imprimeDivisao(20, 2);
		
		System.out.println("Continuando a execução ");
		
		int [] numeros = new int[] {1,2,3,4,5};
//		calc.somaArray(numeros);
		
		calc.somaVarArgs(1, 2, 3, 4, 5);
		
	}
}
