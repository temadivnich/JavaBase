package src;

/**
 48.	Дан массив из N целых чисел. 
 Найти их произведение. 
 Расчет произведения массива реализовать в виде функции.
 * @author pavlovar
 *
 */
public class Task48 {

	public static void main(String[] args) {

		System.out.println(getMultiplicatedArray(new int[] {1,2,3,4,5,}));
		
	}
	
	public static int getMultiplicatedArray (int[] array) {
		
		int multiplication = 1;
		if (array.length == 0) {
			return multiplication = 1; 
		} else {
			for (int i = 0; i < array.length; i++) {
				multiplication *= array[i];
			}
		}
		return multiplication;
	}
}
