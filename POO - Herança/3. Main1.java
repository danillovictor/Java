package POO;

public class Main1 
{

    public static void main(String[] args) 
    {
    	
    	Fornecedor p1 = new Fornecedor ("Heloisa", "Rua das Flores", "(11) 1111-1111", 5000, 500);
    	           

        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());
        System.out.println(p1.getValorCredito());
        System.out.println(p1.getValorDivida());

        p1.obterSaldo();

    }

}