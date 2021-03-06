package br.com.abc.javacore.metodo.classes;

public class Estudante 
{
	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado;
	
	private double media() 
	{
		double media = 0;
		for(double nota : this.notas) 
		{
			media += nota; 
		}
		media  = media / this.notas.length;
		return media;
	}
	
	private boolean status(double media) 
	{
		//String status;
		if(media > 6) 
		{
			this.aprovado = true;
		}
		else 
		{
			this.aprovado = false;
		}
		return this.aprovado;
	}
	private boolean notasNull() 
	{
		if(this.notas.length == 0) 
		{
			return true;
		}
		return false;
	}
	public void imprime() 
	{
		if(this.notasNull() == true) 
		{
			System.out.println("O aluno n�o possui notas!");
		}
		else 
		{
			System.out.println("Nome: " + this.getNome());
			System.out.println("Idade: " + this.getIdade() + " anos");
			for(double nota :  notas) 
			{
				System.out.print(nota + " ");
			}
			System.out.printf("\nM�dia: %.2f\n" , this.media());
			System.out.println("Aprovado? : " + this.status(this.media()));
		}
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getNome() 
	{
		return this.nome;
	}
	public void setIdade(int idade) 
	{
		if(idade < 0) 
		{
			System.out.println("Idade n�o permitida");
			return;
		}
		this.idade = idade;
	}
	public int getIdade() 
	{
		return this.idade;
	}
	public void setNotas(double[] notas) 
	{
		this.notas = notas;
	}
	public double[] getNotas() 
	{
		return this.notas;
	}
	
	public boolean isAprovado() 
	{
		return this.aprovado;
	}
}
