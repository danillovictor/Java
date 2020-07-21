package PacoteJava2;

import java.util.Scanner;

public class Lista2Exerc3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Escreva a idade da pessoa: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("A pessoa se encontra na categoria Infantil.");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("A pessoa se encontra na categoria Juvenil.");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("A pessoa se encontra na categoria Adulto.");
		}
		else
		{
			System.out.println("A idade digitada não está válida.");
		}
	}
}	
