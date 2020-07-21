package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc5 {

	public static void main (String args[]) 
	
	{
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, nota3, mediafinal;
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		nota3 = ler.nextDouble();
		
		mediafinal = Math.round ((nota1*2) + (nota2*3) + (nota3*5)/10);
		
		System.out.println("O valor da média ponderada final é: " + mediafinal);
	}
	
}