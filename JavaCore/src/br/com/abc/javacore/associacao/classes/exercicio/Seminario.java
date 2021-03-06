package br.com.abc.javacore.associacao.classes.exercicio;

public class Seminario 
{
	private String titulo;
	private Aluno [] alunos;
	private Professor professor; //um seminario s� poder� ser ministrado por 1 prof
	private Local local;
	
	public Seminario() {}
	public Seminario(String titulo) 
	{
		this.titulo = titulo;
	}
	
	public void print() 
	{
		System.out.println("----------- Relat�rio de Semin�rios -----------");
		System.out.println("T�tulo: " + this.titulo);
		System.out.println("Professor Palestrante: " + this.professor.getNome());
		System.out.println("Local: Rua " + this.local.getRua() + " Bairro: " + this.local.getBairro());
		System.out.println("Alunos participantes: ");
		for(Aluno aluno : alunos) 
		{
			System.out.println(aluno.getNome() + " ");
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	
	
	
	
	
}
