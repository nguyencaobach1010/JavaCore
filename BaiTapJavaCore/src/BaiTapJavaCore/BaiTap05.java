package BaiTapJavaCore;

import java.util.Scanner;
/**
 * 	Viết chương trình nhập vào tọa độ A(x1, y1) và B(x2, y2) trên hệ trục toạ độ Oxy.
 *  Tính và in ra độ dài đoạn thẳng AB.
 *
 */

public class BaiTap05 {

	public static void main(String[] args) {
		double xA, yA; // tọa độ điểm A
		double xB, yB; // tọa độ điểm B
		double dodaiAB; // độ dài đoạn thắng AB
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tọa độ điểm A: ");
		System.out.println("Nhập hoành độ điểm A:");
		xA = scanner.nextDouble();
		System.out.println("Nhập tung độ điểm A: ");
		yA = scanner.nextDouble();

		System.out.println("\nNhập tọa độ điểm B: ");
		System.out.println("Nhập hoành độ điểm B: ");
		xB = scanner.nextDouble();
		System.out.println("Nhập tung độ điểm B: ");
		yB = scanner.nextDouble();

		// tính độ dài AB
		dodaiAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
		System.out.println("Độ dài đoạn thắng AB = " + dodaiAB);
	}

}
