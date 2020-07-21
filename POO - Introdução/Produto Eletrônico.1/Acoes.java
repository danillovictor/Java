package POO;

public class Acoes {
	public static void main (String args[]) {
		ProdEletronico ProdEletronico1 = new ProdEletronico ("Computador ", 123, true);
		ProdEletronico ProdEletronico2 = new ProdEletronico ("SmartPhone ", 456, false);

        System.out.println(ProdEletronico1.mostrarDados());
        System.out.println(ProdEletronico2.verificarStatusPedido());

        
        System.out.println(ProdEletronico2.mostrarDados());
        System.out.println(ProdEletronico2.verificarStatusPedido());


    }
}