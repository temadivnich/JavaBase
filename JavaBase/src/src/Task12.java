package src;

/**
 * 
 * @author �����
 * 
 * 12.  given 3-digit number
 * calculate sum and multiplication of its digits
 * 
 */
public class Task12 {

	public static void main(String[] args) {

		task12(719);
	}
	
	public static void task12(int number) {
	
		int hundreds = number / 100;
		int dozens   = number / 10 % 10;
		int units    = number % 100 % 10 ;
		System.out.println(hundreds + ", " + dozens + ", " + units);
		int s  =   hundreds + dozens + units;
		System.out.println("sum = " + s);
		System.out.println("composition = " + hundreds * dozens * units);
	}
}
