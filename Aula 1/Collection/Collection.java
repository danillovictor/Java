package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com 
//Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as 
//seguintes funcionalidades:

/*Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class Atividade 
{
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Collection<String> estoque = new ArrayList();
        

		estoque.add("(1) Celular");
		estoque.add("(2) Notebook");
		estoque.add("(3) TV");
		estoque.add("(4) PlayStation");
      
        for(String produtos: estoque)
        {
        	System.out.println("Olá! Seu estoque atual é de: \n "+estoque);
        	break;
        }
        int escolha;
        String item, dados, celular, notebook, tv, playStation = null;
        do
        {
        	
            System.out.println("Please, escolha uma opção:\n (1) Adicionar um item;\n "
                    + "(2) Remover um item;\n (3) Atualizar um item;\n "
                    + "(4) Exibir a lista dos itens;\n (0) Fechar o programa.\n");
            escolha = ler.nextInt();

            if(escolha == 1)
            {
                System.out.println("Informe o item que deseja adicionar a lista: ");
                item = ler.next();
                estoque.add(item);
            }

            else if(escolha == 2)
            {
                System.out.println("Informe o item que deseja remover da lista: ");
                item = ler.next();
                estoque.remove(item);
                if(escolha == 4)
                {
                	estoque.remove(playStation);
                	System.out.println("O item PlayStation foi removido com sucesso!");
                	break;
                }
            }

            else if(escolha == 3)
            {
                System.out.println("Informe o item que deseja atualizar: ");
                dados = ler.next();	
            }
            else if (escolha == 4)
            {
            	System.out.println("Informe o item para remover da lista: ");
                item = ler.next();
            }

            else if(escolha == 5)
            {
                System.out.println("Itens do estoque: " + estoque);
			}
            else
                System.out.println("Sorry, opção invalida, tente novamente...");
            
        }
        while(escolha != 0);
    }
}