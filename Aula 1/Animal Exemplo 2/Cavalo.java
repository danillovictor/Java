package POO;

public class Cavalo extends Animal {
	
	public Cavalo (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("relinchando!");
	}
	
	public void acao() {
		System.out.println("poc poc poc");
	}
}