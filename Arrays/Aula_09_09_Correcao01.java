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
			System.out.println("Entre com um n�mero: ");
			num[x] = ler.nextInt();
			if(num[x]%2==0)
			{
				System.out.println("N�mero par: "+num[x]);
				somapar = somapar+num[x];
			}
			else
			{
				System.out.println("N�mero �mpar: "+num[x]);
				contimpar++;
			}
		}
		System.out.println("Somat�rio dos n�meros pares: "+somapar);
		System.out.println("Contador dos n�meros �mpares: "+contimpar);
	}
}