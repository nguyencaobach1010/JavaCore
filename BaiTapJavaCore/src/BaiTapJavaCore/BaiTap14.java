package BaiTapJavaCore;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BaiTap14 {
	private static Scanner scanner = new Scanner(System.in);
	private static int NUMBER, NUMBER_DELETE;
	private static boolean FIND;
	private static int COUNT = 0;
	public static void main(String[] args) {
		do {
			System.out.print("Nhập số phần tử của mảng: ");
			NUMBER = scanner.nextInt();
		} while (NUMBER <= 0);

		int[] ARR = new int[NUMBER];
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < NUMBER; i++) {
			System.out.printf("ARR[%d] = ", i);
			ARR[i] = scanner.nextInt();
		}
		System.out.println("Nhập số cần Xóa");
		NUMBER_DELETE = scanner.nextInt();

		int[] ARR_TEMP = new int[NUMBER];
		ARR_TEMP[0] = ARR[0];
		COUNT++;

		for (int i = 1; i < ARR.length; i++) {
			FIND = false;
			for (int j = 0; j < COUNT; j++) {
				if (ARR_TEMP[j] == ARR[i]) {
					FIND = true;
					break;
				}
			}
			if (!FIND) {
				ARR_TEMP[COUNT] = ARR[i];
				COUNT++;
			}
		}
		ARR = new int[COUNT];
		for (int i = 0; i < ARR.length; i++) {
			ARR[i] = ARR_TEMP[i];
		}

		System.out.println("Mảng sau khi xóa phần tử trung lặp");
		for (int i : ARR) {
			System.out.print(i + " ");
		}
	}
}
