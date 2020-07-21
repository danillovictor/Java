package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Correcao_Lista2_Exerc1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Entre com o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Entre com o segundoo número: ");
		n2 = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3 = ler.nextInt();
		
			//MENOR		MEIO	MAIOR
			// n1		n2		n3
			// n1		n3		n2
			// n2		n1		n3
			// n2		n3		n1
			// n3		n1		n2
			// n3		n2		n1
		
		
		if(n1<n2 && n2<n3)
		{
			System.out.printf("%d,%d,%d",n1,n2,n3);
		}
			else if(n1<n3 && n3<n2)
			{
			System.out.printf("%d,%d,%d",n1,n3,n2);
			}
				else if(n2<n1 && n1<n3)
				{
					System.out.printf("%d,%d,%d",n2,n1,n3);
				}
					else if(n2<n3 && n3<n1)
					{
						System.out.printf("%d,%d,%d",n2,n3,n1);
					}
						else if(n3<n1 && n1<n2)
						{
							System.out.printf("%d,%d,%d",n3,n1,n2);
						}
							else
							{
								System.out.printf("%d,%d,%d",n3,n2,n1);
							}
	}
}
