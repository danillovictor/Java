package PacoteJava3;

import java.util.Scanner;

public class Correcao_Lista3_Exerc2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num, contpar = 0, contimpar = 0, x;

		for (x = 1; x <= 10; x++)
			;
		{
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
			if (num % 2 == 1) {
				contimpar++; // ++ = para somar os números ímpares
			} else {
				contpar++; // ++ = para somar os números pares
			}
		}
		System.out.println("Temos: " + contimpar + " números ímpares");
		System.out.println("Temos: " + contpar + " números pares");
	}
}
