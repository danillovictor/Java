package POO;

public class ProdEletronico {
    private String nomeProduto; 
    private int numeroPedido; 
    private boolean statusPedido; 

    public ProdEletronico (String p, int np, boolean statusP) 
    {
    	nomeProduto = p;
    	numeroPedido = np;
    	statusPedido = statusP;
    }

    public String mostrarDados () {
        String informacoes = "Produto: "+nomeProduto+" ||| Número do pedido: "+numeroPedido;
        return informacoes;
    } 

    public String verificarStatusPedido () {

        String verificacao;
        if (statusPedido == true) 
        {
            verificacao = "Temos estoque!";
        }

        else {
            verificacao = "Sem estoque!";
        }

        return verificacao;
    }
}
