package PacoteJava3;

import java.util.Scanner;

public class Lista3_Exerc5 
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,soma=0;
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		do
		{
			if (num!=0)
			{
				soma=num+soma;
				num++;
			}
				System.out.println("Digite um n�mero: ");
				num = ler.nextInt();
		}
		while(num!=0);
		System.out.println("A soma dos n�meros digitados s�o de: "+soma);		
	}
}