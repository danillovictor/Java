package POO;

public class Fornecedor extends Pessoa {
	
	private double  valorCredito;
	private double  valorDivida;
	
	 public Fornecedor (String nome, String endereco, String telefone, double valorCredito, double valorDivida) // construtor 
	 {
		 super (nome, endereco, telefone);
		 this.valorCredito = valorCredito;
		 this.valorDivida = valorDivida;
	 }

	public double  getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double  valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double  getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double  valorDivida) {
		this.valorDivida = valorDivida;
	}
	 

	public void obterSaldo() 
	
	{
        double diferenca;
        diferenca = valorCredito - valorDivida;
        System.out.println("A diferença dos valores é de: " +diferenca);
	}
}