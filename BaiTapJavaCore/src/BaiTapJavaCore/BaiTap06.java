package BaiTapJavaCore;

import java.util.Scanner;
/**
 * Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại
 * (VD: nhập vào Cybersoft, in ra tfosrebyC)
 *
 */
public class BaiTap06 {
	public static Scanner scanner = new Scanner(System.in);
	public static String keyword;

	public static void main(String[] args) {
		System.out.print("Nhập một chuỗi: ");
		keyword = scanner.nextLine();
		System.out.println("Chuỗi thường: " + keyword);

		String reverseString = new StringBuffer(keyword).reverse().toString();

		System.out.println("Chuỗi đảo ngược: " + reverseString);

	}

}
