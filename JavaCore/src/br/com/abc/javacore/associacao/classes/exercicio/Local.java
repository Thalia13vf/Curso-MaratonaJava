package br.com.abc.javacore.associacao.classes.exercicio;

public class Local 
{
	private String rua;
	private String bairro;
	
	
	public Local() {}
	public Local(String rua, String bairro) 
	{
		this.bairro = bairro;
		this.rua = rua;
	}
	
	public void print() 
	{
		System.out.println("----------- Relat�rio de Local -----------");
		System.out.println("Rua " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}