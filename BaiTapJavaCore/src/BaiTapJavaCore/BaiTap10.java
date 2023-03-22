package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap10 {
/**
 * Viết chương trình cho phép nhập vào số tự nhiên n, in ra tổng các số nguyên tố
 * từ 1 đến n
 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num = 0;
		String soNguyenTo = "";
		System.out.print("Nhập vào số n:");
		int n = scanner.nextInt();
		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				soNguyenTo = soNguyenTo + i + " ";
			}
		}
		System.out.println("Các số nguyên tố từ 1 đến " + n + " là:");
		System.out.println(soNguyenTo);
	}
}
