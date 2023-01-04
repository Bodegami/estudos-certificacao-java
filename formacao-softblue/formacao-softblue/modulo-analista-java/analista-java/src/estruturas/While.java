package estruturas;

public class While {
	
	public static void main(String[] args) {
		
		int x = 0;
		
// 		while (x <= 10) {
// 			System.out.println(x);
// 			x++;
// 		}
		
// 		while (true) {
// 			System.out.println(x);
// 			
// 			if (x == 10) {
// 				break;
// 			}
// 			
// 			x++;
// 		}
		
		
 		while (x <= 10) {
 			x++;
 			
 			if (x == 5) {
 				continue;
 			}
 			
 			System.out.println(x);
 		}
	}

}
