package BaiTapJavaCore;//

import java.util.Iterator;
import java.util.Scanner;
/**
 * Viết chương trình chuyển đổi số từ hệ cơ số 10
 * sang hệ cơ số nhị phân và ngược lại.
 *
 */
public class BaiTap02 {
	public void convertBinary(int num) {
		int binary[] = new int[100];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public int BinaryToDecimal(int binaryNumber) {
		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;

			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		System.out.println(decimal);
		return decimal;
	}

	public static void main(String a[]) {
		BaiTap02 obj = new BaiTap02();
		System.out.println("Giá trị nhị phân của 47 là: ");
		obj.convertBinary(47);
		
		System.out.println("\nGiá trị nhị phân của 101111 là: ");
		obj.BinaryToDecimal(101111);
	}
}
