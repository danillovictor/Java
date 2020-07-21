package POO;

public class TelefoneFixo extends Telefone 
{
	public TelefoneFixo()
	{
		super("Fixo");
	}
	public void toca (int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("Trim Trim");
		}
	}
	public void disca(String numero)
	{
		System.out.println("Discando: "+numero);
	}
}
