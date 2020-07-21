package POO;

public class TestePolimorfismo {
	public static void main (String args[])
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(123456778L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(8392388333L);				//L= PORQUE USEI O LONG
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa p1:pessoas)
		{
			System.out.println(p1.getNome()); 
		}
	}
}
