package PacoteJava2;

import java.util.Scanner;

public class Lista2Exerc2 {
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
		
		if (x<=y && y<=z)
		{
			System.out.println("A sequ�ncia de n�meros �: "+x+","+y+","+z+".");
		}
		else if (x<=z && z<=y)
			{
			System.out.println("A sequ�ncia de n�meros �: "+x+","+z+","+y+".");
			}
		else if (y<=x && x<=z)
			{
		System.out.println("A sequ�ncia de n�meros �: "+y+","+x+".");
			}
		else if (y<=z && z<=x)
			{
		System.out.println("A sequ�ncia de n�meros �: "+y+","+z+","+x+".");
			}
		else if (z<=x && x<=y)
			{
		System.out.println("A sequ�ncia de n�meros �: "+z+","+x+","+y+".");
			}
		else
		{
			System.out.println("A sequ�ncia de n�meros em ordem crescente � de: "+z+","+y+","+x+".");
		}
	}
}