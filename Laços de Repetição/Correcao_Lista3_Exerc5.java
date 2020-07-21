package PacoteJava3;

import java.util.Scanner;

public class Correcao_Lista3_Exerc5 
{
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,somanum=0;
		do
		{
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			somanum = somanum+num;
			
		}
		while(num!=0);
		
		System.out.printf("A soma dos números: %d",somanum);
	}
}