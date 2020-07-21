package PacoteJava3;

import java.util.Scanner;

public class Aula_08_07_Exemplo2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int valor=50,somavalor=0,cont=0,valor1,somavalor1=0;
		float media,media1;
		
		while(valor<=55)
		{
			System.out.println("Entre com um valor: ");
			valor1 = ler.nextInt();
			somavalor1 = somavalor1+valor1;
			somavalor=somavalor+valor;
			valor++;
			cont++;
		}
		media = somavalor/cont;
		media1 = somavalor1/cont;
		//System.out.println("O número de valores lidos foi de: "+cont);
		System.out.println("Média de valores lidos foi de: "+media);
		System.out.println("Média1 de valores lidos foi de: "+media1);
	}
}