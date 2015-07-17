package src;



/**
 *  16 	Given three-digit number.
 *  check correctness  of the statement: The figures of the numbers form an increasing sequence
 * @author pavlovar
 *
 */
public class Task16 {

	public static void main(String[] args) {

		System.out.println(task16(-987));
		
	}
	
	public static boolean task16 (int number) {
		
		int hundreds = number / 100;
		int dozens = number % 100 / 10;
		int units = number % 100 % 10;
		
		System.out.println(hundreds + ", " + dozens + ", " + units);
		
		return (hundreds < dozens && dozens < units);
	} 
}
