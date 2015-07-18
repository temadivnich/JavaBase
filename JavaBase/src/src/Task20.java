package src;

/**
 * 20. given coordinates of two different fields on the chess field x1, y1, x2, y2
 *  (integers, in range 1-8)
 *  
 * verify the statement: "Qeen figure can move from cell (x1; y1) to cell (x2; y2) per ONE move"
 *
 * @author pavlovar
 *
 */

public class Task20 {

	public static void main (String[] arg) {
		
		System.out.println(checkMove(1, 1, 2, 3));
		
	}
	
	public static boolean checkMove (int oldX, int oldY, int newX, int newY) {
		
		int dimension = 8;
		
		if (oldX <= 0 || oldX > dimension || oldY <= 0 || oldY > dimension ||
				newX <= 0 || newX > dimension || newY <= 0 || newY > dimension) {
			return false;
		}
		int moveX = newX - oldX;
		int moveY = newY - oldY;
		System.out.println("Old cooradinate (" + oldX + ", " + oldY + ")\n"
				+ "New coordinate  (" + newX + ", " + newY + ")");
		return Math.abs(moveX) == Math.abs(moveY) || moveX == 0 || moveY == 0;
	}
	
	
}
