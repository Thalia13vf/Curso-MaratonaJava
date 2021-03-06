package bc.com.abc.javacore.modificadorestatico.classes;

public class Carro 
{
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	//velociade limite 240 km/h
	
	public Carro() 
	{
	}
	public void imprime() 
	{
		System.out.println("-----------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velociade m�xima: " + this.velocidadeMaxima);
		System.out.println( "Velocidade Limite: " + velocidadeLimite);
	}
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public static double getVelocidadeLimite() 
	{
		return Carro.velocidadeLimite;
	}
	public static void setVelocidadeLimite(double velocidadeLimite) 
	{
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	
}
