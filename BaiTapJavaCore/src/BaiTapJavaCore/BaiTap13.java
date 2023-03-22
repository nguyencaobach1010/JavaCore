package BaiTapJavaCore;

import java.awt.Event;
import java.util.Scanner;

public class BaiTap13 {

	private static Scanner scanner = new Scanner(System.in);
	private static int NUMBER, FUNC_NUMBER, ODD, EVEN;
	private static double MIN_NUMBER, MAX_NUMBER;
	private static double MIN_NUMBER_NEGATIVE, MAX_NUMBER_NEGATIVE;
	private static double MIN_NUMBER_POSITIVE, MAX_NUMBER_POSITIVE;
	private static double AVERAGE, TOTAL;

	public static void main(String[] args) {
		do {
			System.out.print("Nhập số phần tử của mảng: ");
			NUMBER = scanner.nextInt();
		} while (NUMBER < 0);
		
		int[] ARR = new int[NUMBER];
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < NUMBER; i++) {
			System.out.printf("ARR[%d] = ", i);
			ARR[i] = scanner.nextInt();
			TOTAL = TOTAL + ARR[i];
		}

		for (int i = 1; i <= 8; i++) {
			System.out.println("1. Tính giá trị trung bình.");
			System.out.println("2. Tìm phần tử lớn nhất, nhỏ nhất.");
			System.out.println("3. Tìm phần tử âm lớn nhất, nhỏ nhất.");
			System.out.println("4. Tìm phần tử dương lớn nhất, nhỏ nhất.");
			System.out.println("5. In ra các phần tử chẵn, lẻ.");
			System.out.println("6. Thêm một phần tử theo vị trí.");
			System.out.println("7. Xóa một phần tử theo vị trí.");
			System.out.println("8. Thoát.");

			do {
				System.out.println("Chọn chức năng từ 1->8: ");
				FUNC_NUMBER = scanner.nextInt();
			} while ((FUNC_NUMBER < 1) || (FUNC_NUMBER > 8));

			switch (FUNC_NUMBER) {
			case 1: {
				TinhTong(ARR);
				break;
			}
			case 2: {
				MaxAndMin(ARR);
				break;
			}
			case 3: {
				MaxNegative(ARR);
				MinNegative(ARR);
				break;
			}
			case 4: {
				MaxPositive(ARR);
				MinPositive(ARR);
				break;
			}
			case 5: {
				OddAndEven(ARR, NUMBER);
				break;
			}
			case 6: {
				ARR = InsertIndex(ARR, NUMBER);
				show(ARR);
				break;
			}
			case 7: {
				DeleteIndex(ARR, NUMBER);
				break;
			}
			case 8: {
				System.out.println("Tạm Biệt!");
				System.exit(FUNC_NUMBER);
				break;
			}
			}
		}
	}

	public static void TinhTong(int[] ARR) {
		AVERAGE = TOTAL / NUMBER;
		System.out.println("Giá trị trung bình là: " + AVERAGE);
		System.out.println();
	}

	public static void MaxAndMin(int[] ARR) {
		MAX_NUMBER = ARR[0];
		MIN_NUMBER = ARR[0];
		for (int i = 0; i < ARR.length; i++) {
			MAX_NUMBER = Math.max(MAX_NUMBER, ARR[i]);
			MIN_NUMBER = Math.min(MIN_NUMBER, ARR[i]);

		}
		System.out.println("Phần tử lớn nhất trong mảng: " + MAX_NUMBER);
		System.out.println("Phần tử nhỏ nhất trong mảng: " + MIN_NUMBER);
		System.out.println();

	}

	public static double MaxNegative(int[] ARR) {
		MAX_NUMBER_NEGATIVE = 0;
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] < 0) {
				MAX_NUMBER_NEGATIVE = ARR[i];
			}
		}
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] < 0 && ARR[i] > MAX_NUMBER_NEGATIVE) {
				MAX_NUMBER_NEGATIVE = ARR[i];
			}
		}
		System.out.println("Phần tử âm lớn nhất trong mảng: " + MAX_NUMBER_NEGATIVE);
		return MAX_NUMBER_NEGATIVE;
	}

	public static double MinNegative(int[] ARR) {
		MIN_NUMBER_NEGATIVE = 0;
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] < 0) {
				MIN_NUMBER_NEGATIVE = ARR[i];
			}
		}
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] < 0 && ARR[i] < MIN_NUMBER_NEGATIVE) {
				MIN_NUMBER_NEGATIVE = ARR[i];
			}
		}
		System.out.println("Phần tử âm nhỏ nhất trong mảng: " + MIN_NUMBER_NEGATIVE);
		return MIN_NUMBER_NEGATIVE;
	}

	public static double MinPositive(int[] ARR) {
		MIN_NUMBER_POSITIVE = 0;
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] >= 0) {
				MIN_NUMBER_POSITIVE = ARR[i];
			}
		}
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] >= 0 && ARR[i] < MIN_NUMBER_POSITIVE) {
				MIN_NUMBER_POSITIVE = ARR[i];
			}
		}
		System.out.println("Phần tử dương nhỏ nhất trong mảng: " + MIN_NUMBER_POSITIVE);
		return MIN_NUMBER_POSITIVE;
	}

	public static double MaxPositive(int[] ARR) {
		MAX_NUMBER_POSITIVE = 0;
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] >= 0) {
				MAX_NUMBER_POSITIVE = ARR[i];
			}
		}
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] >= 0 && ARR[i] > MAX_NUMBER_POSITIVE) {
				MAX_NUMBER_POSITIVE = ARR[i];
			}
		}
		System.out.println("Phần tử dương lớn nhất trong mảng: " + MAX_NUMBER_POSITIVE);
		return MAX_NUMBER_POSITIVE;
	}

	public static void OddAndEven(int[] ARR, int NUMBER) {
		ODD = 0;
		EVEN = 0;
		double[] Odd = new double[NUMBER];
		double[] Even = new double[NUMBER];
		for (int i = 0; i < ARR.length; i++) {
			if (ARR[i] % 2 == 0) {
				Odd[ODD] = ARR[i];
				ODD++;
			} else {
				Even[EVEN] = ARR[i];
				EVEN++;
			}
		}
		System.out.print("Các phần tử chẵn là: ");
		for (int i = 0; i < ODD; i++) {
			System.out.print(Odd[i] + ", ");
		}
		System.out.print("\nCác phần tử lẻ là: ");
		for (int i = 0; i < EVEN; i++) {
			System.out.print(Even[i] + ", ");
		}
		System.out.println();
	}

	public static int[] InsertIndex(int[] ARR, int NUMBER) {
		System.out.print("Nhập phần tử muốn chèn: ");
		NUMBER = scanner.nextInt();
		int ARR_INDEX = ARR.length - 1;
		int TEMP_INDEX = ARR.length;
		int[] TEMP_ARR = new int[TEMP_INDEX + 1];
		boolean INSERTED = false;

		for (int i = TEMP_INDEX; i >= 0; i--) {
			if (ARR_INDEX > -1 && ARR[ARR_INDEX] > NUMBER) {
				TEMP_ARR[i] = ARR[ARR_INDEX--];
			} else {
				if (!INSERTED) {
					TEMP_ARR[i] = NUMBER;
					INSERTED = true;
				} else {
					TEMP_ARR[i] = ARR[ARR_INDEX--];
				}
			}
		}
		return TEMP_ARR;
	}

	public static void DeleteIndex(int[] ARR, int NUMBER_DELETE) {
		System.out.println("Nhập phần từ muốn xóa: ");
		int TEMP;
		NUMBER_DELETE = scanner.nextInt();
		for (int i = TEMP = 0; i < ARR.length - 1; i++) {
			if (ARR[i] != NUMBER_DELETE) {
				ARR[TEMP] = ARR[i];
				TEMP++;
			}
		}
		NUMBER_DELETE = TEMP;
		for (int i = 0; i < NUMBER_DELETE; i++) {
			System.out.print(ARR[i] + " ");

		}
		System.out.println();
	}

	public static void show(int[] ARR) {
		for (int i = 0; i < ARR.length; i++) {
			System.out.print(ARR[i] + " ");
		}
		System.out.println();
	}

}
