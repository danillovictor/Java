package POO;

public class Produto {

	    private String nomeProduto;
	 
	    private boolean statusProduto;

	    public Produto (String nome, int valor, boolean status) 
	    
	    {
	    	nomeProduto = nome;
	    	statusProduto = status;
	    }

	    public String DadosProduto () {
	        String prod = " " +nomeProduto; 
	        return prod;
	    } 
	    
	    public String verStatusProduto () 
	    
	    {

	        String ver;
	        
	        if (statusProduto == true) 
	        	
	        {
	        	return " Produto Disponivel.";
	        }

	        else 
	        {
	            return " Produto Indisponivel.";
	        }

	        //return ver;
	    }
	}