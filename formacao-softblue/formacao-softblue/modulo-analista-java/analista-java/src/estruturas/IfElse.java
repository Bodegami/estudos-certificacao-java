package estruturas;

public class IfElse {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		//As chaves são opcionais quando temos somente UMA instrução no bloco
		
		if (num > 10) {
			System.out.println("O numero é maior que 10");
		}
		else if(num < 10) {
			System.out.println("O numero não é maior que 10");
		}
		else {
			System.out.println("O numero é 10");
		}
		
		
	}

}
