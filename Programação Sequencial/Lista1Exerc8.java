package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc8 {

	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
			
		double custoFab, pcDoDist, pcDoImp, custoCons;
		
		System.out.println("Digite o custo de fábrica: ");
		custoFab = ler.nextDouble();
		
		pcDoDist = (custoFab*28)/100;
		pcDoImp = (custoFab*45)/100;
		custoCons = pcDoDist+pcDoImp+custoFab;
		
		System.out.println("O custo ao consumidor é de: "+custoCons);
		
		
		
				
	}

}
