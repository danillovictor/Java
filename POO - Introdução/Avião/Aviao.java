package POO;

public class Aviao {				//OBJETIVO: CRIAR CADASTRO PARA EMBARQUE NO AEROPORTO
	private String acao5;
	private String potencia;
	private String cor;		//DECLARANDO AS "VARIÁVEIS".
	private String acao4;		//embaralhando para conferir se deu certo
	private String acao3;
	private String acao2;
	private String acao1;
	private String aviao;
	
	public Aviao(String modelo,String vermelho,String motor,String pousar,String voar,String virardireita,String viraresquerda,String paraquedas)
	{
		aviao = modelo;		//BLOCO DO CONSTRUTOR
		cor = vermelho;				//ordem correta para mostrar os dados definida na liha 10
		potencia = motor;
		acao1 = pousar;
		acao2 = voar;
		acao3 = virardireita;
		acao4 = viraresquerda;
		acao5 = paraquedas;
	}
	public String getDadosCompletosAviao()
	{
		String DadosCompletosAviao = aviao+" "+cor+" "+potencia+" "+acao1+" "+acao2+" "+acao3+" "+acao4+" "+acao5;
		return DadosCompletosAviao;		
	}
}