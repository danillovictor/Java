package PacoteJava2;

import java.util.Scanner;

public class Aula_07_07_Exemplo2 {
	public static void main (String args[])
	{
		{
			float num1, num2, resultado;
			int opcao;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Entre com o primeiro n�mero: ");
			num1 = entrada.nextFloat();
			System.out.println("Entre com o segundo n�mero: ");
			num2 = entrada.nextFloat();
			System.out.printf("\n1-Soma 2-Diferenca 3-Multiplica��o 4-Divis�o\n");
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
					System.out.println("N�o existe divis�o por zero.");
				}
				else
				{
				resultado = num1/num2;
				System.out.println("A soma foi de: "+resultado);
				}
				break;
			default: 
				System.out.println("Op��o inv�lida.");
			}
		}
	}
}
