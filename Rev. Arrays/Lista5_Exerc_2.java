package PacoteJava5;

import java.util.Scanner;

public class Lista5_Exerc_2
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		  
		  double imc, altura, peso;
		 	  
		  System.out.println("Digite o seu peso: ");
		  peso= ler.nextDouble();
		  
		  System.out.println("Digite a sua altura: ");
		  altura= ler.nextDouble();
		  
		  imc= (peso/(altura*altura));
		  
		  if (imc<18.5)
		  {
			  System.out.println("Voc� est� abaixo do seu peso!"); 
		  }
		  else if (imc<25)
		  {
			  System.out.println("Voc� est� no peso normal!");
		  }
		  else if (imc<30)
		  {
			  System.out.println("Voc� est� acima do peso!"); 
		  }
		  else
		  {
			  System.out.println("Voc� est� obeso!"); 
		  }
		  
	}
			  
}