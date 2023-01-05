package sobrecarga;

public class Aplicacao {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		
		int soma = m.somar(10, 20);
		System.out.println(soma);
		
		soma = m.somar(10, 20, 5);
		System.out.println(soma);
		
		soma = m.somar(1, 2, 3, 4, 5);
		System.out.println(soma);
		
		double soma2 = m.somar(10.0, 20.0);
		System.out.println(soma2);
		
		//Por de baixo dos panos, o Java faz o cast implicito no int do parametro
		soma2 = m.somar(10.0, 5);
		System.out.println(soma2);
		
	}

}
