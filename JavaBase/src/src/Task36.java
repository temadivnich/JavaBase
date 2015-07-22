package src;
/**
 * 36. Дано целое число N (> 1). 
 * Последовательность чисел Фибоначчи FK определяется следующим образом: 
 * F1 = 1, F2 = 1, FK = FK-2 + FK-1, К = 3, 4, .... 
 * Проверить, является ли число N числом Фибоначчи. 
 * Если является, то вывести Правда, если нет - вывести false.
 * @author pavlovar
 *
 */

public class Task36 {

	public static void main(String[] args) {

		System.out.println(checkFibonacciLoop(1023341611));
	}
	
	public static boolean checkFibonacciLoop (int k) {

		int n2 = 1;
		int n1 = 0;
		int n = 0;
		
		for (int i = 0; n <= k; i++) {
			if (n == k) {
				return true;
			} else {
				n = n1 + n2;
				n2 = n1;
				n1 = n;
			}
		}
		return false;
	}

}
