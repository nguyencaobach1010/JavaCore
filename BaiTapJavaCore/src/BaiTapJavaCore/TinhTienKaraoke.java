package BaiTapJavaCore;

import java.util.Scanner;

public class TinhTienKaraoke {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giờ bắt đầu: ");
        int startHour = scanner.nextInt();
        System.out.print("Nhập giờ kết thúc: ");
        int endHour = scanner.nextInt();
        System.out.print("Nhập số chai nước uống: ");
        int numDrinks = scanner.nextInt();
        scanner.close();

        // Tính thời gian hát và giá tiền
        int hours = endHour - startHour;
        int firstThreeHours = Math.min(hours, 3);
        int remainingHours = Math.max(hours - 3, 0);
        int totalPrice = firstThreeHours * 30000 + (int) (remainingHours * 0.3 * 30000) + numDrinks * 10000;

        // Giảm giá nếu vào cửa từ 9:00 - 17:00
        if (startHour >= 9 && endHour <= 17) {
            totalPrice *= 0.8;
        }

        // In tổng chi phí
        System.out.println("Tổng chi phí: " + totalPrice + " VNĐ");
    }
}
