package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số tiền anh X gửi ban đầu: ");
		double TienGui = scanner.nextDouble();

		System.out.print("Nhập số tiền anh X muốn có trong tương lai: ");
		double TienLai = scanner.nextDouble();

		System.out.print("Nhập lãi suất tiết kiệm (dưới dạng phần trăm): ");
		double LaiXuat = scanner.nextDouble() / 100.0;

		double n = (Math.log(TienLai / TienGui)) / (Math.log(1 + LaiXuat));

		System.out.println(
				"Anh X phải chờ đợi ít nhất " + (int) Math.ceil(n) + " năm để có đủ tiền để mua một chiếc ô tô.");
	}
}
