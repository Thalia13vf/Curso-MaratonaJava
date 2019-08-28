package arrays;

public class Arrays2 {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Maria";
		nomes[1] = "José";
		nomes[2] = "André";
		
		nomes = new String[4];
		
		for(int i = 0; i < nomes.length; i++) 
		{
			System.out.println(i + 1 + "ª nome " + nomes[i]);
		}
		
		
	}

}
