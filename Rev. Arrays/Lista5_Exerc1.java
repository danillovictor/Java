package PacoteJava5;

import java.util.Scanner;

public class Lista5_Exerc1
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x;
		double preconormal, precocondicao;
		
		System.out.println("Digite o valor do produto: ");
		preconormal = ler.nextDouble();
		
		System.out.println("Painel:\n\n1: � vista em dinheiro ou cheque, recebe 20% de desconto. \n2: � vista no cart�o de cr�dito, recebe 15% de desconto. \n3: Em duas vezes, pre�o normal de etiqueta sem juros. \n4: Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%.\n");
		System.out.println("Digite o n�mero do painel anterior: ");
		x = ler.nextInt();
		
		
		if (x == 1)
		{
			precocondicao = (preconormal*0.20);
			System.out.println("Pre�o total a pagar: R$"+precocondicao+ ". Parab�ns! Nesta compra voc� ganhou 20% OFF!");
		}
		else if (x == 2)
		{
			precocondicao = (preconormal*0.15);
			System.out.println("Pre�o total a pagar: R$"+precocondicao+ ". Parab�ns! Nesta compra voc� ganhou 15% OFF!");
		}
		else if (x == 3)
		{
			precocondicao = (preconormal/2);
			System.out.println("Pre�o total a pagar: R$"+precocondicao+" sem juros!");
		}
		else if ( x == 4)
		{
			precocondicao = (preconormal/3)+(preconormal*0.10);
			System.out.println("Pre�o total a pagar: R$"+precocondicao+" com 10% de juros!");
		}
		else
			System.out.println("Digite um valor v�lido.");

	}
}
