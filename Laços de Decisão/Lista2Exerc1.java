package PacoteJava2;

import java.util.Scanner;

public class Lista2Exerc1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x, y, z;
		System.out.println("Digite o primeiro número: ");
		x = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		y = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		z = ler.nextInt();
		
		if (x>y && x>z)
		{
			System.out.println("O maior número informado foi: "+x+".");
		}
		else if (y<x && y>z)
			{
			System.out.println("O maior número informado foi: "+y+".");
			}
		else
		{
			System.out.println("O maior número informado foi: "+z+".");
		}
	}
	

}
