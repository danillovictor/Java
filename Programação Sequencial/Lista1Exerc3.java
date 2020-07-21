package PacoteJava;

import java.util.Scanner;

public class Lista1Exerc3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int horas, minutos, segundos, tempototal;
		System.out.printf("Digite o tempo total de duração da fábrica em segundos: ");
		tempototal = ler.nextInt();
		
		horas = tempototal/3600;
		minutos = (tempototal-(horas*3600))/60;
		segundos = tempototal-(horas*3600)-(minutos*60);
		
		System.out.printf("O tempo total de duração da fábrica é de: %d hora(s), %d minuto(s) e %d segundo(s).",horas,minutos,segundos);
		
		
		
		
	}

}
