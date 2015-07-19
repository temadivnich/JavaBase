package src;

/**
 * 28.	Даны два целых числа A и B (A < B). 
 * Найти произведение всех целых чисел от A до B включительно.
 * @author артем
 *
 */
public class Task28 {

	public static void main(String[] args) {

		task28(5,9);
	}

	public static void task28 (int a, int b) {
		
		for (int i = a, res=1; i <= b; i++) {
			res *= i;
			System.out.println(i + ": " + res );
		}
	}
}
