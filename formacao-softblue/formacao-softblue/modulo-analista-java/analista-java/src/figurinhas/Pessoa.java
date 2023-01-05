package figurinhas;

public class Pessoa {
	
	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;
	}
	
	void dar(int numFigurinhas, Pessoa outra) {
		this.numFigurinhas -= numFigurinhas;
		outra.receber(numFigurinhas);
	}

}
