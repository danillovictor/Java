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
		
		System.out.println("Painel:\n\n1: À vista em dinheiro ou cheque, recebe 20% de desconto. \n2: À vista no cartão de crédito, recebe 15% de desconto. \n3: Em duas vezes, preço normal de etiqueta sem juros. \n4: Em três vezes, preço normal de etiqueta mais juros de 10%.\n");
		System.out.println("Digite o número do painel anterior: ");
		x = ler.nextInt();
		
		
		if (x == 1)
		{
			precocondicao = (preconormal*0.20);
			System.out.println("Preço total a pagar: R$"+precocondicao+ ". Parabéns! Nesta compra você ganhou 20% OFF!");
		}
		else if (x == 2)
		{
			precocondicao = (preconormal*0.15);
			System.out.println("Preço total a pagar: R$"+precocondicao+ ". Parabéns! Nesta compra você ganhou 15% OFF!");
		}
		else if (x == 3)
		{
			precocondicao = (preconormal/2);
			System.out.println("Preço total a pagar: R$"+precocondicao+" sem juros!");
		}
		else if ( x == 4)
		{
			precocondicao = (preconormal/3)+(preconormal*0.10);
			System.out.println("Preço total a pagar: R$"+precocondicao+" com 10% de juros!");
		}
		else
			System.out.println("Digite um valor válido.");

	}
}
