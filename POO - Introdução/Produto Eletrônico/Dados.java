package POO;

public class Dados 
{
	public static void main (String args[])
	{
		ProdutoEletronico produtoeletronico1 = new ProdutoEletronico ("Celular,"," marca Apple,"," modelo 11,"," no pre�o de R$4000,00,"," podendo ser pago a vista,"," no cart�o de cr�dito ou"," no cart�o de d�bito.");
		System.out.println(produtoeletronico1.getDadosCompletosProdutoEletronico());
	}
}
