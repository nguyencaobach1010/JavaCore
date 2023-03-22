package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập chuỗi: ");
		String str = scanner.nextLine();

		System.out.println("Độ dài của chuỗi: " + str.length());

		System.out.print("Nhập vị trí muốn lấy ký tự (từ 0 đến " + (str.length() - 1) + "): ");
		int index = scanner.nextInt();

		System.out.println("Ký tự tại vị trí " + index + " là: " + str.charAt(index));

		if (str.contains("abcdef")) {
			System.out.println("Chuỗi vừa nhập chứa chuỗi phụ 'abcdef'");
		} else {
			System.out.println("Chuỗi vừa nhập không chứa chuỗi phụ 'abcdef'");
		}

		// Đóng đối tượng Scanner
		scanner.close();
	}
}
