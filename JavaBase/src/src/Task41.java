package src;
/**
 * 41.	���� ����� ����� K � ������ �� ������ ����� ��������� �����. 
 * ������� ����� ������� ����� � �������, �������� K. 
 * ���� ����� ����� ���, �� ������� 0.
 * @author �����
 *
 */
public class Task41 {

	public static void main(String[] args) {

		System.out.println(checkValue(5, new int[] {-1,1,3,4}));
	}

	public static int checkValue (int value, int[] array) {
		int result = value;
		for (int i = 0; i < array.length; i++) {
			if (result < array[i]) {
				result = i;
				return result;
			} 
		}
		return result=0;
	}
}
