package POO;

public class Funcionario {
	
	private String nomeFunc;
	private String desempenho;
	private String premio;
	
	public Funcionario(String nome,String rendimento,String premiacao)
	
	{
		nomeFunc = nome;
		desempenho = rendimento;
		premio = premiacao;
		
	}
	public String getDadosCompletosCliente()

	{
		String DadosCompletosFunc = nomeFunc+" "+desempenho+" "+premio;
		return DadosCompletosFunc;
	}
	public String DadosCompletos()
	{
		int desempenho = 72;
		if(desempenho >= 70)
			return "Ele receber� o pr�mio!";
		else
			return "N�o receber� o pr�mio!";
	}

}
