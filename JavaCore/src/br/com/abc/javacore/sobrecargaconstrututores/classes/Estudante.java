package br.com.abc.javacore.sobrecargaconstrututores.classes;

public class Estudante 
{
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;
	
	public Estudante(String matricula, String nome, double[] notas) 
	{
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) 
	{
		this(matricula, nome, notas);
		this.dataMatricula = dataMatricula;
	}
	public Estudante() 
	{
		System.out.println("Dentro do construtor default");
	}
	public void imprime() 
	{
		System.out.println(this.nome);
		System.out.println(this.matricula);
		for(double nota : this.notas) 
		{
			System.out.println(nota + " ");
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
	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}
	public String getMatricula() 
	{
		return this.matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
}
