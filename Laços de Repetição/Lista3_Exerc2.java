package PacoteJava3;

import java.util.Scanner;

public class Lista3_Exerc2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,x,par=0,impar=0;
		
		for (x = 1; x <= 10; x++)
		{
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
			if(num%2==0)
			{
				par++;
			}
			
				else
				{
				impar++;
				}
			
		}
		
		System.out.println("Os n�meros pares digitados s�o: "+par);
		System.out.println("Os n�meros �mpares digitados s�o: "+impar);
		
		//2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	}
}
