package bc.com.abc.javacore.modificadorestatico.classes;

public class Cliente 
{
	private static int[] parcelas;
	
	{
		System.out.println("Bloco de inicializa��o n�o est�tico");
	}
	
	static
	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicializa��o est�tico!!!");
		for(int i = 1; i <= 100; i++) 
		{
			parcelas[i - 1] = i;
		}
	}
	static 
	{
		System.out.println("Bloco est�tico 2");
	}
	static 
	{
		System.out.println("Bloco est�tico 3");
	}
	
	public Cliente() 
	{
	}
	
	public static int[] getParcelas() 
	{
		return parcelas;
	}	
	
}
