package PacoteJava3;

import java.util.Scanner;

public class Lista3_Exerc2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,x,par=0,impar=0;
		
		for (x = 1; x <= 10; x++)
		{
			System.out.println("Digite um número: ");
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
		
		System.out.println("Os números pares digitados são: "+par);
		System.out.println("Os números ímpares digitados são: "+impar);
		
		//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	}
}
