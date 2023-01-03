package casting;

public class Casting {

	public static void main(String[] args) {
		
		
		/**
		 * EXEMPLO CASTING IMPLICITO
		 * 
		 * O valor 10 é passado como tipo int. Quando declaramos a variavel do tipo long e passamos o valor 
		 * do tipo int, por de baixo dos panos o java faz o casting dessa variavel para o tipo long.
		 * 
		 */
		
		long x = 10; //casting implicito
		x = 10L; //sem casting
		
		float y = 40; //casting implicito
		y = 40F; //sem casting
		
		
		/**
		 * EXEMPLO CASTING EXPLICITO
		 * 
		 * Usamos o casting explicito quando queremos dizer para o Java como ele deve interpretar um determinado dado.
		 * Porém, é preciso tomar cuidado, pois fazer o casting para valores maiores que um tipo de variavel pode receber,
		 * pode gerar erros inesperados como no exemplo do short e do byte.
		 * Por isso, utilize só quando tiver certeza que o retorno é o esperado.
		 *    
		 */
		
		float z = (float) 40.0; //casting explicito
		
		//short s = 100000; -> não compila, pois o valor é maior que o tipo short
		short s = (short) 100000; //forçamos o casting
		
		System.out.println(s); //resultado inesperado
		
		byte b = 127; //ok
		//b = 130; -> não compila
		b = (byte) 130; //forçamos o casting
		
		System.out.println(b);
		
	}
	
}
