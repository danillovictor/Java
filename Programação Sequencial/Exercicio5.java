package PacoteJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main (String args[]) 
	
	{
		Scanner ler = new Scanner (System.in);
		
		float nota1, nota2, nota3, mediafinal;
		
		System.out.println("Etre com a primeira nota:");
		nota1 = ler.nextInt();
		System.out.println("Etre com a segunda nota:");
		nota2 = ler.nextInt();
		System.out.println("Etre com a terceira nota:");
		nota3 = ler.nextInt();
		
		mediafinal = Math.round ((nota1*2) + (nota2*3) + (nota3*5)/10);
		
		System.out.println("O valor da média final é: " +mediafinal);
 }
	
}