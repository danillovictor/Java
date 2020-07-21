package POO;

public class Preguica extends Animal {
	
	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("ZzZ! Zzz! dormindo.. ZZzzZ!...");
	}
	
	public void acao() {
		System.out.println("Subindo árvores leeentamente!");
	}

}