package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, totaldias;
		System.out.printf("Digite o número total de vida: ");
		totaldias = ler.nextInt();
		
		anos = totaldias/365;
		meses = (totaldias%365/30);
		dias = (totaldias%365%30);
		
		System.out.printf("Você possui: %d ano(s), %d mese(s) e %d dia(s) de vida.",anos,meses,dias);
	}

}
