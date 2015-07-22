package src;
/**
 * 36. ���� ����� ����� N (> 1). 
 * ������������������ ����� ��������� FK ������������ ��������� �������: 
 * F1 = 1, F2 = 1, FK = FK-2 + FK-1, � = 3, 4, .... 
 * ���������, �������� �� ����� N ������ ���������. 
 * ���� ��������, �� ������� ������, ���� ��� - ������� false.
 * @author pavlovar
 *
 */

public class Task36 {

	public static void main(String[] args) {

		System.out.println(checkFibonacciLoop(1023341611));
	}
	
	public static boolean checkFibonacciLoop (int k) {

		int n2 = 1;
		int n1 = 0;
		int n = 0;
		
		for (int i = 0; n <= k; i++) {
			if (n == k) {
				return true;
			} else {
				n = n1 + n2;
				n2 = n1;
				n1 = n;
			}
		}
		return false;
	}

}
