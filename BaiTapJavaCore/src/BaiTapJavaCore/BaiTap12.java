package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap12 {
/**
 * 	Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác
 *  vuông có độ dài tương ứng. VD: nhập vào số 4 sẽ in ra kết quả:
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.printf("Nhập vào chiều cao của tam giác: ");
		number = sc.nextInt();
		for (int i = 1; i <= number; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
