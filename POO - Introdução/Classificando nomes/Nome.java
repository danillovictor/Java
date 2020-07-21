package POO;

public class Nome {				//OBJETIVO: CRIAR M�TODO QUE IMPRIMA O NOME CORRETO NO CONSOLE.
	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	
	public Nome(String primeiro,String meio, String ultimo)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomeDoMeio = meio; //bloco de constru��o do CONSTRUTOR
	}
	public String getNomeCompletoPessoa()
	{
		String nomeCompleto = primeiroNome+" "+nomeDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
