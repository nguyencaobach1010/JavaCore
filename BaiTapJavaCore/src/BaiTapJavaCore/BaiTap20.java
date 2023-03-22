package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap20 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử trong mảng:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] evenArr = new int[n];
        int[] oddArr = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenCount] = arr[i];
                evenCount++;
            } else {
                oddArr[oddCount] = arr[i];
                oddCount++;
            }
        }

        System.out.print("Mảng chẵn: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArr[i] + " ");
        }

        System.out.print("\nMảng lẻ: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }

}
