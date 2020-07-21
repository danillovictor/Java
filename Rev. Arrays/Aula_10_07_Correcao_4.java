package PacoteJava5;

import java.util.Scanner;

public class Aula_10_07_Correcao_4 
	{
	public static void main(String args[])
	{
		double soma=0;
		int x=1,y=1,a=1;
		
		//for(a=1;a<=99;a++)
		while (a<=50)
		{
			soma = soma+(x/y);
			x+=2;
			y++;
			a++;
		}
		System.out.println("Somatório: "+soma);
	}
}