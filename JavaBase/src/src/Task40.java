package src;

import static java.util.Arrays.*;

import java.util.Arrays;
/**
 * 38. Дан массив из десяти целых чисел. Найти их сумму.
 * 39. Дан массив из десяти целых чисел. Найти их произведение.
 * 40. Дан массив из десяти целых чисел. Найти их среднее арифметическое.
 *
 * @author pavlovar
 */
public class Task40 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6};  
		System.out.println("Sum of elements = " + getSumAvgMult(array)[0]);
		System.out.println("Multiplication Value = " + getSumAvgMult(array)[1]);
		System.out.println("Average Value = " + getSumAvgMult(array)[2]);
	}

	public static double[] getSumAvgMult (int[] array) {
		
		if (array.length == 0) {
			return null;
		}
		double[] result = new double[3];
		double avg=0;
		double sum = 0;
		double multiplication = 1;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			multiplication *= array[i]; 
		}
		avg = sum/array.length;
		
		result[0] = sum;
		result[1] = multiplication;
		result[2] = avg;
		return result;
	}
}
