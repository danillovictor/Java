package POO;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ("Bobby", 17);
		Cavalo cavalo = new Cavalo ("Alipio", 8);
		Preguica preguica = new Preguica("Danilo",22);
		//Animal animal = null;
		
		System.out.println("O nome do cachorro é "+cachorro.getNome());
		cachorro.emitirSom();
		cachorro.acao();
		System.out.println("");

		System.out.println("O nome do cavalo é "+cavalo.getNome());
		cavalo.emitirSom();
		cavalo.acao();
		System.out.println("");
		
		System.out.println("O nome da preguiça é "+preguica.getNome());
		preguica.emitirSom();
		preguica.acao();
		System.out.println("");
	}
}