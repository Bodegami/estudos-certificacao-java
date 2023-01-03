package estruturas;

public class SwitchExpression {
	
	public enum DiaDaSemana {
		SEGUNDA,
		TERCA,
		QUARTA,
		QUINTA,
		SEXTA,
		SABADO,
		DOMINGO
	}
	
	public static void main(String[] args) {
		
		DiaDaSemana d = DiaDaSemana.QUARTA;
		DiaDaSemana d2 = DiaDaSemana.SEGUNDA;
		
		// Versão antiga, mas ainda disponivel
		
//		switch (d) {
//		case SEGUNDA: System.out.println(1); break;
//		case TERCA: System.out.println(2); break;
//		}
		
		
		// As switch expression surgiram no Java 12
		// Note que agora não é mais preciso declarar o break, ou seja, o erro de fault true não ocorre mais.
		// Podemos utiliza-lo como função como no exemplo da variavel i;
		
		switch (d) {
		case SEGUNDA -> System.out.println(1);
		case TERCA -> System.out.println(2);
		case QUARTA -> {
			System.out.println(3);
			System.out.println("Quartou!!");
			}
		default -> System.out.println("outro");
		}
		
		int i = switch(d2) {
			case SEGUNDA -> 1;
			case TERCA -> 2;
			default -> 0;
		};
		
		System.out.println(i);

	}
	
}
