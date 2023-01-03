package estruturas;

public class Switch {

	public static void main(String[] args) {
		
		int num = 1;
		
		//O switch faz uma comparação de igualdade e ele só aceita tipos int, String e enums
		//O switch também nos obriga a colocar o break, do contrario ele vai executar tudo que que está abaixo.
		//Podemos simplificar a escrita nos cases 1, 2, 3 e 4
		
		switch (num) {
		case 1, 2, 3, 4:
			System.out.printf("O numero é %d\n", num);
			break;
		case 5:
			System.out.println("O número é 5");
			break;
		case 10:
			System.out.println("O número é 10");
			break;
		case 15:
			System.out.println("O número é 15");
			break;
		default:
			System.out.println("O número é outro");
			break;
		}
		
		
	}
	
	
}
