package POO;

public class Dados 
{

	public static void main (String args[])
	{
		Cliente cliente1 = new Cliente ("Tomas Souza ||"," 22 anos ||"," Brasileiro ||"," CE 102030 ||"," Passaporte 1234||");
		System.out.println(cliente1.getDadosCompletosCliente());

	}
}