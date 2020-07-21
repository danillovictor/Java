package POO;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno 										
{
	public static void main (String args[]) 
	{
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();		//map n�o estende collection.
		
		Aluno a = new Aluno("Jo�o","Java",8.6);
		Aluno b = new Aluno("Maria","Linux",7.5);
		Aluno c = new Aluno("Isabel","SO",6);
		Aluno d = new Aluno("Matheus","C#",10);
		
		mapa.put("Jo�o",a);				//funcao put: tem chave e tem valor. neste caso: chave: jo�o e valor: a || funcao put � igual a funcao do add usado para list, por�m o put usamos no MAP
		mapa.put("Maria",b);
		mapa.put("Isabel",c);
		mapa.put("Matheus",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Isabel"));
		
		
															//� poss�vel trabalhar com um collection dentro de um map, por�m ele n�o estende de collection. somente iniciando ele (collection) dentro do map
		Collection<Aluno> alunos = mapa.values();			//values: um m�todo originado do mapa, ao digitar mapa. (mapa e ponto final)
		for(Aluno e: alunos) //e: vari�vel de loop			
		{
			System.out.println(e);							//o map vai ordenar o arraylist n�o.
		}
	}
}