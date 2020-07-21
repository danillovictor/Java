package POO;

public class TelefoneCelular extends Telefone
{
	public TelefoneCelular()
	{
		super("celular");
	}
	public void toca(int codigoToque)
	{
		switch (codigoToque)
		{
		case 1:
			System.out.println("Tananana Tanananan..");
			break;
		case 2: 
			System.out.println("Ohh o gás..");
			break;
		default:
			System.out.println("Hello moto");
			break;
		}
	}
	public void disca(String numero)
	{
		System.out.println("O número: "+numero+" é um celular...");
	}
}
