package sobrecarga;

public class Matematica {
	
	int somar(int x, int y) {
		System.out.println("int somar(int x, int y)");
		return x + y;
	}
	
	int somar(int x, int y, int z) {
		System.out.println("int somar(int x, int y, int z)");
		return x + y + z;
	}
	
	int somar(int... numeros) {
		System.out.println("int somar(int... numeros)");
		int i = 0;
		
		for (Integer num : numeros) {
			i += num;
		}
		
		return i;
	}
	
	double somar(double x, double y) {
		System.out.println("double somar(double x, double y)");
		return x + y;
	}
	

}
