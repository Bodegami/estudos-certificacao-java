package figurinhas;

public class Aplicacao {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "José";
		p1.numFigurinhas = 0;
		
		p1.receber(5);
		
		System.out.println(p1.nome + " => " + p1.numFigurinhas);
		
		p1.receber(7);
		
		System.out.println(p1.nome + " => " + p1.numFigurinhas);
		
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		p2.numFigurinhas = 0;
		
		System.out.println(p2.nome + " => " + p2.numFigurinhas);
		
		p1.dar(2, p2);
		
		System.out.println(p2.nome + " => " + p2.numFigurinhas);
		
	}
	
	
}
