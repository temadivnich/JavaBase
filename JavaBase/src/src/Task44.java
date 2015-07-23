package src;
/*
 44.	ƒано целое число N и массив из N целых чисел, упор€доченный по возрастанию. 
 ƒанный набор может содержать одинаковые элементы. 
 ¬ывести в том же пор€дке все различные элементы данного массива.
  */
public class Task44 {

	public static void main(String[] args) {

		cleanUp(new int[] {1,1,1,2,2,3,3,3,3,4,5,6,7,7,7,8});
	}

	public static void cleanUp (int[] array) {
		if (array.length == 0) {	
			System.out.println("Enter valid array");
		}else{ 
		
			int newArrayLength = 1;
			//in this loop calculating new array length
			for (int i = 1; i < array.length; i++) {
				if (array[i-1] == array[i]) {
				} else {
					++newArrayLength;
				}
			}
			
			int[] newArray = new int[newArrayLength];
			newArray[0] = array[0];
			
			//removing duplicate values
			for (int i = 1, k = 1; i < array.length; i++) {
				if (array[i-1] == array[i]) {
				} else {
					newArray[k++] = array[i];
				}
			}
			for (int i : newArray) {
				System.out.print(i + ", ");
			}
		}
	}
}
