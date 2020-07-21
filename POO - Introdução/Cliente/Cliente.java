package POO;

public class Cliente {				//OBJETIVO: CRIAR CADASTRO PARA EMBARQUE NO AEROPORTO
	private String nomeCompleto;
	private String passaporte;
	private String cartaoEmbarque;		//DECLARANDO AS "VARIÁVEIS".
	private String nacionalidade;		//embaralhando para conferir se deu certo
	private String idade;
	
	public Cliente(String primeiro,String segundo,String terceiro,String quarto,String quinto)
	{
		nomeCompleto = primeiro;		//BLOCO DO CONSTRUTOR
		idade = segundo;				//ordem correta para mostrar os dados definida na liha 10
		nacionalidade = terceiro;
		cartaoEmbarque = quarto;
		passaporte = quinto;			
	}
	public String getDadosCompletosCliente()
	{
		String DadosCompletosCliente = nomeCompleto+" "+idade+" "+nacionalidade+" "+cartaoEmbarque+" "+passaporte;
		return DadosCompletosCliente;		
	}
}