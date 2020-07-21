package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Correcao_Lista2_Exerc4_SwitchCase {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num, n;
		double res;
		System.out.println("Entre com o número qualquer: ");
		num = ler.nextInt();
		if(num%2==0)
		{
			//res = Math.sqrt(num);
			System.out.println("Número par");
			n=0;
		}
		else
		{
			System.out.println("Número ímpar");
			n=1;
		}
		{
			switch(n)
			{
			case 0:
				res = Math.sqrt(num);
				System.out.println("Raiz quadrada: "+res);
				break;
			case 1:
				res = Math.pow(num, 2);
				System.out.println("Potência: "+res);
				break;
			default:
				
				System.out.println("Inexistente...");
			}
		}
	}
}
