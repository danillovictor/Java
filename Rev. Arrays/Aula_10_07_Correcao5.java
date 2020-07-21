package PacoteJava5;

import java.util.Scanner;

public class Aula_10_07_Correcao5 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float [] vet = new float [5];
		int codigo;
		
		for(int x=0;x<5;x++)
		{
			System.out.println("Entre com um valor para o vetor: ");
			vet[x] = ler.nextFloat();
		}
		System.out.println("Entre com o código: ");
		codigo = ler.nextInt();
		if(codigo ==0)
		{
			System.out.println("Vaza...");
		}
		else if (codigo == 1)
		{
			for(int x=0;x<5;x++)
			{
				System.out.println("Posição "+(x+1)+": "+vet[x]);
			}
		}
		else if (codigo == 2)
		{
			for(int x=4;x<=0;x--)
			{
				System.out.println("Posição "+(x)+" : "+vet[x]);
			}
		}
		else
		{
			System.out.println("Código inválido!");
		}
	}

}
