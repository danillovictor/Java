package PacoteJava2;

import java.util.Scanner;

public class Lista2Exerc1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x, y, z;
		System.out.println("Digite o primeiro n�mero: ");
		x = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		y = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		z = ler.nextInt();
		
		if (x>y && x>z)
		{
			System.out.println("O maior n�mero informado foi: "+x+".");
		}
		else if (y<x && y>z)
			{
			System.out.println("O maior n�mero informado foi: "+y+".");
			}
		else
		{
			System.out.println("O maior n�mero informado foi: "+z+".");
		}
	}
	

}
