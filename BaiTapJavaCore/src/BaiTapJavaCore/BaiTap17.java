package BaiTapJavaCore;

import java.util.Random;
import java.util.Scanner;

public class BaiTap17 {

	public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(1000) + 1;

		Scanner scanner = new Scanner(System.in);
        int guess;
        boolean correct = false;

        System.out.println("Máy tính đã chọn một số từ 1 đến 1000. Hãy đoán xem số đó là gì.");

        while (!correct) {
            System.out.print("Nhập số đoán của bạn: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Chúc mừng! Bạn đã đoán đúng!");
                correct = true;
            } else if (guess < secretNumber) {
                System.out.println("Số của bạn nhỏ hơn số bí mật. Hãy đoán lại.");
            } else {
                System.out.println("Số của bạn lớn hơn số bí mật. Hãy đoán lại.");
            }
        }

        scanner.close();
    }

}
