package PacoteJava3;

import java.util.Scanner;

public class Lista3_Exerc4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x = 1,idade,sexo,estado,mulheresnervosas=0,homensagressivos=0,pessoascalmas=0,pessoasnervosas40=0,pessoascalmas18=0;
		//System.out.println("Entre com a sua idade: ");
		
	while(x <= 150)
	{
		System.out.println("Entre com a idade: ");
		idade = ler.nextInt();
		System.out.println("Se for feminino digite 1 e se for masculino digite 2: ");
		sexo = ler.nextInt();
		System.out.println("Se for uma pessoa calma digite 1, se for nervosa digite 2, se for agressiva digite 3: ");
		estado = ler.nextInt();
		
		if (estado==1)
		{
			pessoascalmas++;
		}
		if(sexo==1 && estado==2)
		{
			mulheresnervosas++;
		}
		if(sexo==2 && estado==3)
		{
			homensagressivos++;
		}
		if(estado==2 && idade>40)
		{
			pessoasnervosas40++;
		}
		if(estado==1 && idade<18)
		{
			pessoascalmas18++;
		}
		x++; //para não ficar em loop infinito
	}
	System.out.println("Pessoas calmas: "+pessoascalmas);
	System.out.println("Pessoas nervosas: "+mulheresnervosas);
	System.out.println("Homens agressivos: "+homensagressivos);
	System.out.println("Pessoas nervosas com mais de 40 anos: "+pessoasnervosas40);
	System.out.println("Pessoas agressivas com menos de 18 anos: "+pessoascalmas18);
	}
}