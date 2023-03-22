package BaiTapJavaCore;

import java.util.Iterator;
import java.util.Scanner;

public class BaiTap09 {
/**
 * Viết chương trình cho phép nhập vào 2 số nguyên dương (từ 10 đến 99), in TRUE
 * nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE
 * (VD: (12, 81) => true,(23, 89) => false)
 */

	public static Scanner scanner = new Scanner(System.in);
	private static int number1;
	private static int number2;
	private static String string1;
	private static String string2;
	public static void main(String[] args) {

		do {
			System.out.print("nhập vào số nguyên dương 1: ");
			number1 = scanner.nextInt();
			System.out.print("nhập vào số nguyên dương 2: ");
			number2 = scanner.nextInt();
			string1 = String.valueOf(number1);
			string2 = String.valueOf(number2);
			if(string2.contains(string1.substring(0,1)) || string2.contains(string1.substring(1,2))) {
				System.out.println("TRUE");
				
			}
			else {
				System.out.println("FALSE");
			}
		
		} while (number1 >= 10 && number2 <= 99);
	}
}
