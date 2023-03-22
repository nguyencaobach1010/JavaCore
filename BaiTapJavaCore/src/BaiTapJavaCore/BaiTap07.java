package BaiTapJavaCore;

import java.util.Scanner;
/**
 * Viết chương trình cho phép nhập vào một số tự nhiên và in ra các ước số của số
 * tự nhiên đó
 *
 */
public class BaiTap07 {
	public static Scanner scanner = new Scanner(System.in);
	public static int Number;

	public static void main(String[] args) {
		System.out.print("Nhập số: ");
		Number = scanner.nextInt();
		
		System.out.println("Ước của số " + Number + " : ");
		
		for (int i = 1 ; i <= Number; i++) {
			if (Number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
