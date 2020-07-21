package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Correcao_Lista2_Exerc2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num;
		double res;
		System.out.println("Entre com o número qualquer: ");
		num = ler.nextInt();
		if(num%2==0)
		{
			res = Math.sqrt(num);
			System.out.println("Número par e sua raiz quadrada é: "+res);
		}
		else
		{
			res = Math.pow(num, 2);
			System.out.println("Número ímpar e sua potência é: "+res);
		}

	}
}
