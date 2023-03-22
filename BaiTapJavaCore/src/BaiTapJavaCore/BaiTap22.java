package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap22 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vị trí kangaroo 1: ");
        int x1 = scanner.nextInt();
        System.out.print("Vị trí kangaroo 2: ");
        int x2 = scanner.nextInt();
        System.out.print("Vận tốc kangaroo 1: ");
        int v1 = scanner.nextInt();
        System.out.print("Vận tốc kangaroo 2: ");
        int v2 = scanner.nextInt();

        if (canMeet(x1, x2, v1, v2)) {
            System.out.println("2 kangaroos chạm nhau.");
        } else {
            System.out.println("2 kangaroos không chạm nhau.");
        }
    }

    private static boolean canMeet(int x1, int x2, int v1, int v2) {
        if (v1 <= v2) {
            return false; // the kangaroo with the slower velocity cannot catch up
        }

        int relativePosition = x2 - x1;
        int relativeVelocity = v1 - v2;

        return relativePosition % relativeVelocity == 0;
    }
}
