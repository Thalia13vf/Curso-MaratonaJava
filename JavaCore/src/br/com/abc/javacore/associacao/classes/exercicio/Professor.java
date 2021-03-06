package br.com.abc.javacore.associacao.classes.exercicio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario [] seminarios;
	
	public Professor() {}
	public Professor(String nome, String especialidade) 
	{
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public void print() 
	{
		System.out.println("----------- Relatório de Professor -----------");
		System.out.println("Nome do Professor: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		System.out.print("Seminários participantes: ");
		for(Seminario seminario : seminarios) 
		{
			System.out.print(seminario.getTitulo() + " ");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
}
