package POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ListFinal {
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Collection<String> estoque = new ArrayList();

        int escolha;
        String item, dados;

        do
        {
            System.out.println("Por favor, escolha uma opção:\n (1) Adicionar um produto;\n "
                    + "(2) Remover um produto;\n (3) Atualizar um produto;\n "
                    + "(4) Exibir a lista de produtos;\n (0) Fechar o programa.\n");
            escolha = ler.nextInt();

            if(escolha == 1)
            {
                System.out.println("Informe o item para adicionar à lista: ");
                item = ler.next();
                estoque.add(item);
            }

            else if(escolha == 2)
            {
                System.out.println("Informe o item para remoção da lista: ");
                item = ler.next();
                estoque.remove(item);
            }

            else if(escolha == 3)
            {
                System.out.println("Qual item deseja substituir? "); //Informe a atualização do item:
                item = ler.next();

                System.out.println("Substituir por: "); //Informe o item que deseja remover da lista:
                dados = ler.next();

                if(estoque.contains(item))
                {
                    estoque.remove(item);
                    estoque.add(dados);
                }
            }

            else if(escolha == 4)
                System.out.println("Itens do estoque: " + estoque + "\n");

            else
                System.out.println("Obrigado, volte sempre!");
        }
        while(escolha != 0);
    }
}