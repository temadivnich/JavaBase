package src;
/**
41.	Дано целое число K и массив из десяти целых ненулевых чисел. 
Вывести номер первого числа в массиве, большего K. 
Если таких чисел нет, то вывести 0.

42.	Дано целое число K и массив из десяти целых ненулевых чисел. 
Вывести номер последнего числа в массиве, большего K. 
Если таких чисел нет, то вывести 0.
 *
 */
public class Task41and42 {

	public static void main(String[] args) {

		System.out.println(task41(5, new int[] {-1,1,3,4,6,1,1}));
		System.out.println(task42(5, new int[] {-1,1,3,4,6,1,1}));

	}

	public static int task41 (int value, int[] array) {
		int result = value;
		for (int i = 0; i < array.length; i++) {
			if (result < array[i]) {
				return result=i;
			} 
		}
		return result=0;
	}
	
	public static int task42 (int value, int[] array) {
		int result = value;
		for (int i = array.length-1; i >= 0; i--) {
			if (result < array[i]) {
				return result=i;
			} 
		}
		return result=0;
	}
}
