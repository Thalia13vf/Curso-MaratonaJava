package bc.com.abc.javacore.modificadorestatico.test;

import bc.com.abc.javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		System.out.println("Exibindo quantidade de parcelas possíveis");
//		for(int parcela : c.getParcelas()) 
//		{
//			System.out.print(parcela + " ");
//		}
		
		System.out.println("Tamanho: " + Cliente.getParcelas().length);
		System.out.println("Tamanho: " + Cliente.getParcelas().length);
		System.out.println("Tamanho: " + Cliente.getParcelas().length);
	}

}
