package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Exemplo2 {
	public static void main (String args[])
	{
		{
			float num1, num2, resultado;
			int opcao;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Entre com o primeiro número: ");
			num1 = entrada.nextFloat();
			System.out.println("Entre com o segundo número: ");
			num2 = entrada.nextFloat();
			System.out.printf("\n1-Soma 2-Diferenca 3-Multiplicação 4-Divisão\n");
			opcao = entrada.nextInt();
			switch(opcao)
			{
			case 1:
				resultado = num1+num2;
				System.out.println("A soma foi de: "+resultado);
				break;
			case 2:
				resultado = num1-num2;
				System.out.println("A soma foi de: "+resultado);
				break;
			case 3:
				resultado = num1*num2;
				System.out.println("A soma foi de: "+resultado);
				break;
			case 4:
				if (num2==0)
				{
					System.out.println("Não existe divisão por zero.");
				}
				else
				{
				resultado = num1/num2;
				System.out.println("A soma foi de: "+resultado);
				}
				break;
			default: 
				System.out.println("Opção inválida.");
			}
		}
	}
}
