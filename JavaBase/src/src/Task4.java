package src;
/**
 * 
 * 4. Поменять местами содержимое переменных A и B, 
 * используя только эти две переменные, и вывести новые значения A и B.
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
