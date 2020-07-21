package PacoteJava3;

import java.util.Scanner;

public class Correcao_Lista3_Exerc4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, sexo,fp,contpc=0,contmn=0,contha=0,contpn40=0,contpc18=0,x=1;
		
		while(x<=6) ///ATENCAO: usando 6 exemplos para simplificar
		{
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			System.out.println("Entre com a seu sexo:-- 1-Feminino / 2- Masculino ");
			sexo = ler.nextInt();
			System.out.println("Entre com a sua fator psicológico-- 1-Calma /2- Nervoso /3-Agressivo ");
			fp = ler.nextInt();
			
			if (fp==1)
			{
				contpc++;
			}
			if(sexo==1 && fp==2)
			{
				contmn++;
			}
			if(sexo==2 && fp==3)
			{
				contha++;
			}
			if(fp==2 && idade>40)
			{
				contpn40++;
			}
			if(fp==1 && idade<18)
			{
				contpc18++;
			}
			x++;
		}
		System.out.println("Pessoas calmas: "+contpc);
		System.out.println("Pessoas nervosas: "+contmn);
		System.out.println("Homens agressivos: "+contha);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("Pessoas agressivas com menos de 18 anos: "+contpc18);
	}
}