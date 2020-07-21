package PacoteJava4;

import java.util.Scanner;

public class Aula_09_09_Correcao01 {
	public static void main (String args[])		//exercicio 2
	{
		Scanner ler = new Scanner (System.in);
		int [] num = new int [6];
		int somapar=0,contimpar=0,x;
		
		for(x=0;x<6;x++)
		{
			System.out.println("Entre com um número: ");
			num[x] = ler.nextInt();
			if(num[x]%2==0)
			{
				System.out.println("Número par: "+num[x]);
				somapar = somapar+num[x];
			}
			else
			{
				System.out.println("Número ímpar: "+num[x]);
				contimpar++;
			}
		}
		System.out.println("Somatório dos números pares: "+somapar);
		System.out.println("Contador dos números ímpares: "+contimpar);
	}
}