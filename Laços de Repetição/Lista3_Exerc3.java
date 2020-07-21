package PacoteJava3;

import java.util.Scanner;

public class Lista3_Exerc3 {
	public   static   void   main ( String   args [])
	{
		/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		Scanner ver =   new   Scanner ( System.in);
		
		int idade, maior=0, menor=0;
		
		System.out.println("Informe a idade");
        idade = ver.nextInt();

        while(idade != -99) 
        
        {

                if (idade < 21) 
                {
                    menor++;
                }
                
                else if (idade > 50) 
                {
                    maior++;
                }
       System.out.println("Informe a idade");
       idade = ver.nextInt();

        }
        
        System.out.println("Menores de 20 anos: " +menor+ " pessoas ");
        System.out.println("Maior de 50 anos: " +maior+ " pessoas ");
   }
}