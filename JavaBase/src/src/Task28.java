package src;

/**
 * 28.	���� ��� ����� ����� A � B (A < B). 
 * ����� ������������ ���� ����� ����� �� A �� B ������������.
 * @author �����
 *
 */
public class Task28 {

	public static void main(String[] args) {

		task28(5,9);
	}

	public static void task28 (int a, int b) {
		
		for (int i = a, res=1; i <= b; i++) {
			res *= i;
			System.out.println(i + ": " + res );
		}
	}
}
