package POO;

public class MainAnimal 
	{
		public static void main (String args[])
		{
			Cachorro cao = new Cachorro();
			Cavalo cav = new Cavalo();
			Preguica preg = new Preguica();
			
			
			//cao.correr();
			//cao.emitirSom();
			cao.setNome("Bobby");
			cao.setIdade(17);
			cao.correr();
			cao.emitirSom();
			
			System.out.println(cao.getNome());
			System.out.println(cao.getIdade());
			
			System.out.println(" _____________________________________ \n");

			cav.setNome("Alipio");
			cav.setIdade(8);
			cav.correr();
			cav.emitirSom();
			
			System.out.println(cav.getNome());
			System.out.println(cav.getIdade());
			
			System.out.println(" _____________________________________ \n");
			
			preg.setNome("Danilo");
			preg.setIdade(22);
			preg.correr();
			preg.emitirSom();
			
			System.out.println(preg.getNome());
			System.out.println(preg.getIdade());
		}
}
