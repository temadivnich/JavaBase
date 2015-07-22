package src;

/**
 * 24.	���� ����� ����� � ��������� 100�999. 
 * ������� ������-�������� ������� �����, 
 * ��������: 256 � ������� ��������� ������, 814 � ���������� �������������.
 * 
 * @author �����
 *
 */
public class Task24 {

	public static void main(String[] args) {

	}
	public static String printNumber(int number ) {
		StringBuilder string = new StringBuilder();
		
		if (number < 100 || number > 999) {
			return "Invalid input: " + number + "\nEnter value in range between 100 and 999";
		}
		
		int hundreds = number / 100;
		int dozens = number % 100 / 10;
		int units = number % 100 % 10;
		switch (hundreds) {
			case 1: string.append("one ");
			case 2: string.append("two ");
			case 3: string.append("three ");
			case 4: string.append("four ");
			case 5: string.append("five ");
			case 6: string.append("six ");
			case 7: string.append("seven ");
			case 8: string.append("eight ");
			case 9: string.append("nine ");
			default: string.append("hundred ");
		}
		switch (dozens) {
			case 1: string.append("one ");
			case 2: string.append("two ");
			case 3: string.append("three ");
			case 4: string.append("four ");
			case 5: string.append("five ");
			case 6: string.append("six ");
			case 7: string.append("seven ");
			case 8: string.append("eight ");
			case 9: string.append("nine ");
			default: string.append("hundred ");
	}
		return "";
	}
}
