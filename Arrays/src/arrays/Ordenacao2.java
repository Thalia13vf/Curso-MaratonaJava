package arrays;

import java.util.Scanner;

public class Ordenacao2 {

	public static void main(String[] args) {
		//CRESCENTE
		Scanner teclado = new Scanner(System.in);
		int[] num = new int[4];
		int temp = 0;
		
		for(int i = 0; i < num.length; i++) 
		{
			num[i] = teclado.nextInt();
		}
		
		for(int c = 0; c < num.length; c++) 
		{
			for(int j = c; j < num.length; j++) 
			{
				if(num[c] > num[j]) 
				{
					temp = num[c];
					num[c] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(num[0] + " " +num[1] + " " + num[2]+" "+num[3]);
	}

}
