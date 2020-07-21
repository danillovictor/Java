package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc7 {
	public static void main (String args[])
	{
Scanner ler = new Scanner (System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.printf("Entre com o primeiro valor de A: ");
		a = ler.nextDouble();
		System.out.printf("Entre com o primeiro valor de B: ");
		b = ler.nextDouble();
		System.out.printf("Entre com o primeiro valor de C: ");
		c = ler.nextDouble();
		System.out.printf("Entre com o primeiro valor de D: ");
		d = ler.nextDouble();
		System.out.printf("Entre com o primeiro valor de E: ");
		e = ler.nextDouble();
		System.out.printf("Entre com o primeiro valor de F: ");
		f = ler.nextDouble();
		
		x = Math.round ((c*e)-(b*f))/((a*e)-(b*d));
		y = Math.round ((a*f)-(c*d))/((a*e)-(b*d));
		
		
		System.out.println("O valor de X é de: "+x);
		System.out.println("O valor de Y é de: "+y);
	}

}
