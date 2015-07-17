package src;

/**
 * Created by kravchpa on 7/16/2015.
 */

public class TaskSands {
    public static void main (String[]arggs){
    	
        int round=50;
        int [] vars = {10,5456,44,21,10000,0,36,890,32};
      //  replace(round, vars);

        myTasks('P', 56);
        
        
        
        
    }
    
    public static void myTasks(char letter, int numberOfTasks)
     {
    	int remainder = letter % 4;
		System.out.println("Your index of tasks is " + remainder);

		int[] myTasksList = new int[numberOfTasks/4 + 1];
		System.out.println("You have " + myTasksList.length + " tasks.\nThey are: ");

    	for (int i = 1, pos=0; i <= numberOfTasks; i++) {
   		
			if (i%4 == remainder) {
				myTasksList[pos++] = i;
			}
    	}
		for (int i : myTasksList) {
			System.out.print(i + ", ");
		}
     }
    
    
    public static void  replace (int round, int ... a )
    {	round--;
    	
    if (round >= 0 ) { 
/*    	for (int i = 0; i < a.length; i++ ) {  
            System.out.print(a[i] + ", ");            
        }
    	System.out.println();
*/
    	int temp = a[a.length-1];
    	
        for (int i = a.length-1; i > 0; i-- ) {
            
        	a[i] = a[i-1];
        }
        a[0] = temp;
        
        for (int i = 0; i < a.length; i++ ) { 
        	System.out.print(a[i] + ", ");            
        }
    	System.out.println();

        replace (round, a);
        
    }
      

    }

    
}

