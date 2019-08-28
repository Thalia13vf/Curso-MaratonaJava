package arrays;

import java.util.Scanner;

public class Ordenacao {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		//DECRESCENTE
		int[] numeros = new int[4];
		int temp = 0;
		for (int i = 0; i < numeros.length; i++) 
		{
			numeros[i] = teclado.nextInt();
		}
		for(int c = 0; c < numeros.length; c++) 
		{
			for(int j = c; j < numeros.length; j++) 
			{
				if(numeros[j] > numeros[c]) 
				{
					temp = numeros[c];
					numeros[c] = numeros[j];
					numeros[j] = temp;
				}
			}
		}
		System.out.println(numeros[0] + " "+numeros[1] + " "+numeros[2] + " "+ numeros[3]);
	}

}
