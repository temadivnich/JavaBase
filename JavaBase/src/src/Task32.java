package src;
/**
 * 32.	Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) 
 * определяется следующим образом: 
 * F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Вывести элементы F1, F2, ..., FN.
 * @author артем
 *
 */
public class Task32 {

	public static void main(String[] args) {

		System.out.println(fibonaciCountRecursion(5));
	
	}
	
	
	public static void fibonaciCount (int k) {
		int n  = 0;
		int n1 = 0;
		int n2 = 0;
		
		for (int i = 1, res = 1; i <= k; i++) {
			res = n2 + n1;
		}
		
	}
	
	public static int fibonaciCountRecursion (int k) {
		if (k <= 1) return 1;
		int res = fibonaciCountRecursion(k-1) + fibonaciCountRecursion(k-2);
		System.out.println(res);
		System.out.println("error");
		return res;
	}	
}
