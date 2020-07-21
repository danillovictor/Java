package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Exemplo_1 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("entre com um número");
		num = entrada.nextInt();
		if(num>0)
		{
			System.out.println("Número positivo...");
		}
		else if(num<0)
			{
			System.out.println("Número negativo...");
			}
		else
		{
			System.out.println("É zero.");
		}
		
	}

}
