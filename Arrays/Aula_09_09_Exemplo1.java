package PacoteJava4;

import java.util.Scanner;

public class Aula_09_09_Exemplo1 {
	
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		/*String [] s1 = new String[5];
		int[] b;
		b = new int[10];
		int [] c = new int [2], d = new int [3], e = new int [5];
		int [] elementos = {5,6,7,8};
		int [] meuVetor;
		
		meuVetor = new int[3];
		meuVetor[0]=100;
		meuVetor[1]=110;
		meuVetor[2]=120;*/
		
		final int constante = 4;
		int [] a1 = new int [constante];
		int acumulador =0;
		float media;
		
		for(int i=0;i<a1.length;i++)//length conta o tamanho do array
		{
			System.out.printf("Entre com um valor para a posição %d :", (i+1));
			a1[i] = leia.nextInt();
			acumulador += a1[i];
		}
		for(int i=0;i<a1.length;i++)
		{
			//System.out.printf("\nPosição: %d: %d", i+1, a1[i]);
			System.out.println("\nPosição: "+(i+1)+" o valor é:"+a1[i]);
		}
		
		
		media = acumulador / a1.length;
		System.out.println("\nMédia é: " +media);
	}

}