package POO;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno 										
{
	public static void main (String args[]) 
	{
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();		//map não estende collection.
		
		Aluno a = new Aluno("João","Java",8.6);
		Aluno b = new Aluno("Maria","Linux",7.5);
		Aluno c = new Aluno("Isabel","SO",6);
		Aluno d = new Aluno("Matheus","C#",10);
		
		mapa.put("João",a);				//funcao put: tem chave e tem valor. neste caso: chave: joão e valor: a || funcao put é igual a funcao do add usado para list, porém o put usamos no MAP
		mapa.put("Maria",b);
		mapa.put("Isabel",c);
		mapa.put("Matheus",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Isabel"));
		
		
															//é possível trabalhar com um collection dentro de um map, porém ele não estende de collection. somente iniciando ele (collection) dentro do map
		Collection<Aluno> alunos = mapa.values();			//values: um método originado do mapa, ao digitar mapa. (mapa e ponto final)
		for(Aluno e: alunos) //e: variável de loop			
		{
			System.out.println(e);							//o map vai ordenar o arraylist não.
		}
	}
}