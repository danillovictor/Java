package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Exemplo_1 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("entre com um n�mero");
		num = entrada.nextInt();
		if(num>0)
		{
			System.out.println("N�mero positivo...");
		}
		else if(num<0)
			{
			System.out.println("N�mero negativo...");
			}
		else
		{
			System.out.println("� zero.");
		}
		
	}

}
