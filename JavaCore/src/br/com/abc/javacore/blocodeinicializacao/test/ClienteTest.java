package br.com.abc.javacore.blocodeinicializacao.test;

import br.com.abc.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		System.out.println("Exibindo quantidade de parcelas possíveis");
		for(int parcela : c.getParcelas()) 
		{
			System.out.print(parcela + " ");
		}
	}

}
