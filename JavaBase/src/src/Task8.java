package src;

import java.util.Scanner;

/**
	8.	���� ���������� �����. ������� ������� ��� ����� ����� (�������), 
	� ����� � ���  ������ ����� (�������). 
	��� ���������� �������� ������������ �������� ������� ������, 
	��� ���������� ������ � �������� ������ ������� �� �������.
*/
public class Task8 {

	public static void main(String[] args) {

		task8(10);		
	}

	public static void task8 (int number)
	{
		int dozens = number / 10;
		int unit   = number % 10;
		
		System.out.println(dozens);	
		System.out.println(unit);	
		
	}
}
