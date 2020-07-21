package PacoteJava3;

import java.util.Scanner;

public class Lista3_Exerc6 
{
	public   static   void   main ( String   args [])
	{
		Scanner ver =   new   Scanner ( System.in);
		/*Escrever um programa que receba vários números inteiros no 
		teclado. E no final imprimir a média dos números múltiplos
		de 3. Para sair digitar 0(zero).(DO...WHILE)*/

		int num, soma=0, cont=0;
		float media;
				
	     do    	 
	     {
	    	 System.out.println("Digite um número: ");
				num=ver.nextInt();
	    	 if (num%3==0 && num!=0)
	   
	    	 {
	    		 soma=soma+num;
	    		 cont++;
	    	 } 
	     }
	    	 while (num!=0); 
	    		 
	    		 media=soma/cont;
	    		 
	    System.out.println("A media dos números multiplos é : " +media);
	    
	}
}