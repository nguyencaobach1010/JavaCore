package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 3) {
			System.out.println("Menu");
			System.out.println("1. Giải PT bậc 1 (ax + b = 0)");
			System.out.println("2. Giải PT bậc 2 (ax^2 + bx + c = 0)");
			System.out.println("3. Exit");
			System.out.print("Chọn giải phương trình bậc 1 hoặc 2: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				solveLinearEquation(input);
				break;
			case 2:
				solveQuadraticEquation(input);
				break;
			case 3:
				System.out.println("Thoát chương trình");
				break;
			default:
				System.out.println("Vui lòng chọn lại!!!");
			}
			System.out.println();
		}
	}

	public static void solveLinearEquation(Scanner input) {
		System.out.print("Nhập giá trị a: ");
		double a = input.nextDouble();
		System.out.print("Nhập giá trị b: ");
		double b = input.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vô số nghiệm");
			} else {
				System.out.println("PT vô nghiệm");
			}
		} else {
			double x = -b / a;
			System.out.println("PT có nghiệm x = " + x);
		}
	}

	public static void solveQuadraticEquation(Scanner input) {
		System.out.print("Nhập giá trị a: ");
		double a = input.nextDouble();
		System.out.print("Nhập giá trị b: ");
		double b = input.nextDouble();
		System.out.print("Nhập giá trị c: ");
		double c = input.nextDouble();

		double delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.printf("Phương trình có nghiệm kép x = %.2f%n", x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f, x2 = %.2f%n", x1, x2);
		}
	}
}
