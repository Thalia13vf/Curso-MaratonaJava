package br.com.abc.javacore.metodo.classes;

public class Calculadora 
{
	
	public void somaDoisNumeros() 
	{
		System.out.println(5+5);
	}
	public void subtraiDoisNumeros() 
	{
		System.out.println(5-5);
	}
	public void multiplicaDoisNumeros(double num1, int num2) 
	{
		System.out.println(num1 * num2);
	}
	public double divideDoisNumeros(double num1, double num2) 
	{
		if(num2 != 0) 
		{
			return num1 / num2;
		}
		return 0;
	}
	public void imprimeDivisao(double num1, double num2) 
	{
		if(num2 != 0) 
		{
			System.out.println(num1 / num2);
			return; //serve como um break, encerra a execussão e volta para quem chamou
		}
		
			System.out.println("Não é possível dividir por 0");
	}
	public void alteraDoisNumeros(int a, int b) 
	{
		System.out.println("Dentro do altera dois números");
		System.out.println(a);
		System.out.println(b);
		a = 30;
		b = 40;
		
		System.out.println("Num 1: " + a);
		System.out.println("Num 2: " + b);
	}
	public void somaArray(int [] numeros) 
	{
		int soma = 0;
		
		for(int num : numeros) 
		{
			soma += num;
		}
		System.out.println(soma);
	}
	public void somaVarArgs(double d,int ... numeros) 
	{
		int soma = 0;
		
		for(int num : numeros) 
		{
			soma +=num;
		}
		System.out.println(soma);
	}
}
