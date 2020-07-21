package PacoteJava5;

import java.util.Scanner;

public class Lista5_Exerc5 
{
	public static void main(String[] args) 
	{
	Scanner ver = new Scanner(System.in);

     float [] vetor = new float[5];
     int lista;

     for(int i = 0; i < 5; i++) {
         System.out.println("Informe o valor do vetor" +(i+1)+ " : ");
         vetor[i]=ver.nextFloat();
     }

     System.out.println("Escolha uma opção \n1- Vetor na ordem direta \n2- Vetor na ordem inversa");
     lista=ver.nextInt();

     if (lista==1) 
     
     {
         System.out.printf("Vetor: ");
         for(int i= 0; i < 5; i++) 
         
         {
             System.out.printf(vetor[i] + "\n");
         }
         
     }
     
     else if(lista == 2)
     {
         System.out.printf("Vetor na ordem inversa: ");
         for (int i = 4; i >= 0 ; i--) 
         
         {
             System.out.printf(vetor[i]+ "\n");
         }
         
     	} 
     	else 
     		{
     			System.out.println("Código inválido");
     		}
	}

}