package POO;

public class ProdutoEletronico {
	private String produto;
	private String debito;
	private String credito;
	private String avista;
	private String preco;
	private String modelo;
	private String marca;
	
	public ProdutoEletronico(String celular,String apple, String onze, String valor, String formapagamento1, String formapagamento2, String formapagamento3)
	{
		produto = celular;
		marca = apple;
		modelo = onze;
		preco = valor;
		avista = formapagamento1;
		credito = formapagamento2;
		debito = formapagamento3;
	}
	//{
		
	//}
	
	public String getDadosCompletosProdutoEletronico()
	{
		String DadosCompletosProdutoEletronico = produto+" "+marca+" "+modelo+" "+preco+" "+avista+" "+credito+" "+debito;
		return DadosCompletosProdutoEletronico;
	}

}
