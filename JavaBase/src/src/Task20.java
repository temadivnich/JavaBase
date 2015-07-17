package src;

/**
 *
 *  20.	���� ���������� ���� ��������� ����� ��������� ����� x1, y1, x2, y2 
 *  (����� �����, ������� � ��������� 1�8). 
 *  ��������� ���������� ������������:
 *  ������ �� ���� ��� ����� ������� � ������ ���� �� ������.
 * @author pavlovar
 *
 */

public class Task20 {

	public static void main (String[] arg) {
		
		System.out.println(checkMove(1, 1, 2, 3));
		
	}
	
	public static boolean checkMove (int oldX, int oldY, int newX, int newY) {
		
		int moveX = newX - oldX;
		int moveY = newY - oldY;
		System.out.println("Old cooradinate (" + oldX + ", " + oldY + ")\n"
				+ "New coordinate  (" + newX + ", " + newY + ")");
		return Math.abs(moveX) == Math.abs(moveY) || moveX == 0 || moveY == 0;
	}
	
	
}
