package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc6 {
	public static void main (String args[]) 
	{
		Scanner ler = new Scanner (System.in);
		
		double x1,x2,y1,y2,x,y,d,res;
		
		System.out.println("Entre com o priemrio valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Entre com o priemrio valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Entre com o priemrio valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Entre com o priemrio valor de Y2: ");
		y2 = ler.nextDouble();
		
		x = (double) Math.pow((x1-x2),2);
		y = (double) Math.pow((y1-y2),2);
		d = (double) Math.sqrt(x+y);
		res = (double) Math.round(d);
				
		System.out.println("O valor de D é: " +res);
		
	}

}
