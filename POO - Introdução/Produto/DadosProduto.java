package POO;

public class DadosProduto 
{
	public static void main (String args[]) 
	{
		       
	Produto produto1 = new Produto ("Disponibilidade do produto: ", 1, true);
	Produto produto2 = new Produto ("Indisponivel", 0, false);
		    	        
		    	        
	System.out.println(produto1.DadosProduto());
	System.out.println(produto1.verStatusProduto());

		    	        
	}
}