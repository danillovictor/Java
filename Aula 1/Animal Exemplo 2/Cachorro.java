package POO;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("Au! Au!");
	}
	
	public void acao() {
		System.out.println("Correndo rápido!");
	}

}