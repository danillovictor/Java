package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesteList {
	public static void main (String args [])
	{
		Collection<String> nomes = new ArrayList(); 			//ArrayList: lista de arrays
		nomes.add("Antonio");
		nomes.add("Maria");
		nomes.add("Danilo");
		nomes.add("Bruno Moura");
		
		for(String name: nomes)
		{
			System.out.println("Lista de Nomes: "+name);					//funcao para mostrar (varrer nome a nome) cada nome na minha lista de forma individual no console
		}
		//Collection <String> nomes1 = Arrays.asList("Luis","Monique");		//funcao para adicionar novos nomes a minha lista inicial
		
		//nomes.addAll(nomes1);												//addAll: para adicionar todos os novos nomes criados na linha 16
		//System.out.println("Lista de nomes: "+nomes);
		
		//System.out.println("Contém o valor Danilo? "+nomes.contains("Danilo"));		//função que mostra true ou false se tem o dado declarado
		
		//System.out.println("Lista de nomes: "+nomes);
		//nomes.clear();										//função para limpar o console (limpar a lista)
		//System.out.println("Listagem após clear: "+nomes);

		nomes.remove("Antonio");						//método para remover um nome "remove"
		System.out.println("Lista de nomes: "+nomes);

		//if(nomes.isEmpty())							//se a lista estivesse vazia, mas não está
		//{
		//	System.out.println("Lista Vazia");
		//}
		
		
		//System.out.println("Lista de nomes: "+nomes);

	}

}
