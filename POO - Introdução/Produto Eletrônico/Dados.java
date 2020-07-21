package POO;

public class Dados 
{
	public static void main (String args[])
	{
		ProdutoEletronico produtoeletronico1 = new ProdutoEletronico ("Celular,"," marca Apple,"," modelo 11,"," no preço de R$4000,00,"," podendo ser pago a vista,"," no cartão de crédito ou"," no cartão de débito.");
		System.out.println(produtoeletronico1.getDadosCompletosProdutoEletronico());
	}
}
