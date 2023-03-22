package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap11 {
/**
 * 	Viết chương trình cho phép nhập vào số tự nhiên n, in ra số tự nhiên lớn nhất nhỏ
 *  hơn log2 (n).
 */
	public static Scanner scanner = new Scanner(System.in);
	private static int number;
	private static double log2n;

	public static void main(String[] args) {
		System.out.print("Nhập số n: ");
		number = scanner.nextInt();
		log2n = (Math.log(number)/ Math.log(2));
		
		System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(n): " + log2n);
	}

}
