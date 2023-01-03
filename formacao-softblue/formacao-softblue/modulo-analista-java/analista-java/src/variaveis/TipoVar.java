package variaveis;

public class TipoVar {
	
	public static void main(String[] args) {
	
		//Antes do Java 10
		// Fortemente tipada e por conta disso, podemos declarar e so depois inicializa-la como no exemplo x.
		int x;
		boolean y = false;
		x = 10;
		
		//Depois do Java 10
		//O var da mais liberdade por não precisar declarar o tipo, porém você ñ consegue declara-la s/ inicializa-la.
		var x2 = 20;
		var y2 = true;
		//var z2; -> não compila
		
		
	}

}
