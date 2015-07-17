package src;

import java.util.Scanner;

/**  
 * get my tasks
 */
public class Task0 {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your surname: ");
		char letter = 'P';//s.next().charAt(0);
		
		System.out.println("Enter total number of tasks: ");
		int numberOfTasks = 56;//s.nextInt();
		
		int remainder = letter%4;
		// если numberOfTasks % 4 != 0 - округл€ю размер массива
		int[] myTasksList = new int[numberOfTasks/4 + 1 ]; 
		System.out.println("Your task index = " + remainder);
		System.out.println("You have these tasks: ");
		
		for (int i = 1, pos = 0; i <= numberOfTasks; i++) {
			if (i%4 == remainder) {
				myTasksList[pos++] = i;
			}
		}
		
		for (int i : myTasksList) {
			System.out.print(i + ", ");
		}
	}
		
		
	

}
