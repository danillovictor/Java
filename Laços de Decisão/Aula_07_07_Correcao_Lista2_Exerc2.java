package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Correcao_Lista2_Exerc2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num;
		double res;
		System.out.println("Entre com o n�mero qualquer: ");
		num = ler.nextInt();
		if(num%2==0)
		{
			res = Math.sqrt(num);
			System.out.println("N�mero par e sua raiz quadrada �: "+res);
		}
		else
		{
			res = Math.pow(num, 2);
			System.out.println("N�mero �mpar e sua pot�ncia �: "+res);
		}

	}
}
