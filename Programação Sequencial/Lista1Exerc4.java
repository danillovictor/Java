package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
				
		int a, b, c;
		double d, r, s;
		
		System.out.printf("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.printf("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.printf("Digite o valor de C: ");
		c = ler.nextInt();
		
		r = (double) Math.pow((a+b),2);
		s = (double) Math.pow((b+c),2);
		
		d = (r+s)/2;
				
		System.out.println("O valor de D é: " +d);
	}

}
