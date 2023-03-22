package BaiTapJavaCore;

import java.util.Scanner;
/**
 * Viết chương trình cho phép nhập vào một số tự nhiên và in ra tổng các chữ số
 * của số tự nhiên đó.
 *
 */
public class BaiTap04 {
	public static Scanner scanner = new Scanner(System.in);
	public static int Tong;

	public static void main(String[] args) {
		System.out.print("Nhập số a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập số b: ");
		int b = scanner.nextInt();
		Sum(a, b);
	}

	public static int Sum(int a, int b) {
		Tong = a + b;
		System.out.println(Tong);
		return Tong;
	}
}
