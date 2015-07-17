package src;

import java.util.Scanner;

/**
	8.	Дано двузначное число. Вывести вначале его левую цифру (десятки), 
	а затем — его  правую цифру (единицы). 
	Для нахождения десятков использовать операцию деления нацело, 
	для нахождения единиц — операцию взятия остатка от деления.
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
