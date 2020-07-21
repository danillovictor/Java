package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com 
//Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as 
//seguintes funcionalidades:

/*Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class NovaLista 
{
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Collection<String> estoque = new ArrayList();
        

		estoque.add("Celular");
		estoque.add("Notebook");
		estoque.add("TV");
		estoque.add("PlayStation");

		for(String produtos: estoque)
		{
			System.out.println("Estoque atual: "+produtos);
		}
		Collection <String> prod = Arrays.asList("Impressora","Relógio");
		
		estoque.addAll(prod);
		System.out.println("Estoque SUBTOTAL:  "+estoque);
		estoque.remove("Celular");	
		System.out.println("Lista TOTAL: "+estoque);
    }
    
}