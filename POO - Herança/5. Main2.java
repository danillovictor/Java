package POO;

public class Main2 
{

    public static void main(String[] args) 
    {
    	
    	Empregado p1 = new Empregado ("Elisa","Avenida Guarulhos","4002-8922",030517,5000,250);
    	Pessoa p2 = new Pessoa ("Enzo","Avenida Maia","2121-2222");
    	Empregado p3 = new Empregado("Samuel","Avenida Brasil","2323-2323",0401,2500,50);

        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());
        System.out.println(p1.getSalarioBase());
        System.out.println(p1.getImposto());
        System.out.println(p1.getCodigoSetor());
        
        System.out.println(p2.getNome());
        System.out.println(p3.getCodigoSetor());
        System.out.println(p3.getNome());
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        	
        p1.calcularSalario();
        p3.calcularSalario();
    }

}