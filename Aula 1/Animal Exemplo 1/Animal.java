package POO;

public abstract class Animal 
{
	private String nome;
	private int idade;
	
	public abstract void emitirSom();
	public abstract void correr();
	
	public Animal (String nome)
	{
		this.nome = nome;
	}
	public Animal (int idade)
	{
		this.idade = idade;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
