package PacoteJava2;

import java.util.Scanner;

public class Lista2Exerc4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		double potencia, raiz;
		int num;
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		
		if (num%2==0)
		{
			raiz = Math.sqrt(num);
			//System.out.println("O n�mero: "+num+ " � par e a sua raiz quadrada �: "+raiz+".");
			// estava fazendo com PRINTLN E CONCATENANDO COM O + e estava dando erro no arredondamento.
			System.out.printf("O n�mero %d � par e sua raiz quadrada %.2f", num, raiz);
		}
			else
			{
			potencia = Math.pow(num,2);
			//System.out.println("O n�mero: "+num+ " � �mpar e elevado ao quadrado �: "+potencia+".");
			// estava fazendo com PRINTLN E CONCATENANDO COM O + e estava dando erro no arredondamento.
			System.out.printf("O n�mero %d � �mpar e elevado ao quadrado �: %.2f",num, potencia);
			}
	}
}