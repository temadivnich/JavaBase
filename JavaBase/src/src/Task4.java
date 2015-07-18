package src;
/**
 * 4. Change values of variables A and B, 
 * using only these two variables and print them 
 * 
 */

public class Task4 {

	public static void main(String[] args) {

		int a = 10;
		int b = -20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
