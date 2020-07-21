package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias, totaldias;
		System.out.println("Entre com o valor de anos: ");
		anos = ler.nextInt();
		System.out.println("Entre com o valor de meses: ");
		meses = ler.nextInt();
		System.out.println("Entre com o valor de dias: ");
		dias = ler.nextInt();
		
		totaldias = dias+(365*anos)+(meses*30);
		System.out.println("Total de dias vividos: "+totaldias+" dias");
	}

}