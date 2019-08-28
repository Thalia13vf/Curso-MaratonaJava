package bc.com.abc.javacore.modificadorestatico.classes;

public class Cliente 
{
	private static int[] parcelas;
	
	{
		System.out.println("Bloco de inicialização não estático");
	}
	
	static
	{
		parcelas = new int[100];
		System.out.println("Dentro do bloco de inicialização estático!!!");
		for(int i = 1; i <= 100; i++) 
		{
			parcelas[i - 1] = i;
		}
	}
	static 
	{
		System.out.println("Bloco estático 2");
	}
	static 
	{
		System.out.println("Bloco estático 3");
	}
	
	public Cliente() 
	{
	}
	
	public static int[] getParcelas() 
	{
		return parcelas;
	}	
	
}
