package POO;

public class Acoes 
{
	public static void main(String args[])
	{
		Aviao aviao1 = new Aviao (" Avião modelo 2019,","cor branca\n","potência de 100 mil libras\n","pousou no Aeroporto de São Paulo\n","depois de ter sobrevoado toda a capital\n","com capacidade de virar para a direita\n","e para a esquerda com comandos rápidos\n","além de contar com suporte para paraquedas\n");
		System.out.println(aviao1.getDadosCompletosAviao());
	}
}
