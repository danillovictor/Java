package PacoteJava2;

import java.util.Scanner;

public class Lista2Exerc2 {
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
		
		if (x<=y && y<=z)
		{
			System.out.println("A sequência de números é: "+x+","+y+","+z+".");
		}
		else if (x<=z && z<=y)
			{
			System.out.println("A sequência de números é: "+x+","+z+","+y+".");
			}
		else if (y<=x && x<=z)
			{
		System.out.println("A sequência de números é: "+y+","+x+".");
			}
		else if (y<=z && z<=x)
			{
		System.out.println("A sequência de números é: "+y+","+z+","+x+".");
			}
		else if (z<=x && x<=y)
			{
		System.out.println("A sequência de números é: "+z+","+x+","+y+".");
			}
		else
		{
			System.out.println("A sequência de números em ordem crescente é de: "+z+","+y+","+x+".");
		}
	}
}