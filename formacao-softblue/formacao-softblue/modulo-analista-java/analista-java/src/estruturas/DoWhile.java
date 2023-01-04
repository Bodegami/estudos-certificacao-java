package estruturas;

public class DoWhile {

	public static void main(String[] args) {
		
		// Do While tem uma caracteristica interessante que ao menos uma vez o bloco será executado, pois a verificação so 
		// ocorre no final depois do bloco. Já na estrutura While a verificação já feita no inicio, antes de entrar no bloco.
		
		int x = 0;
		
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
		
	}
	
}
