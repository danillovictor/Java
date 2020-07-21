package PacoteJava3;

import java.util.Scanner;

public class Aula_08_07_Exemplo3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade,maior=0,menor=0;
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		do
		{
			if (idade>=18)
			{
				maior++;
			}
			else
			{
				menor++;
			}
			System.out.println("Idade que digitei: "+idade);
			System.out.println("Entre com sua idade: ");
			idade = ler.nextInt();
			
		}while(idade!=0);
			
		System.out.println("Temos: "+maior+ " pessoa(s) de maior idade.");
		System.out.println("Temos: "+menor+ " pessoa(s) de menor idade.");

}
}