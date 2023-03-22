package BaiTapJavaCore;

import java.util.Scanner;

public class BaiTap21 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String longestPalindrome = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr) && subStr.length() > longestPalindrome.length()) {
                    longestPalindrome = subStr;
                }
            }
        }

        System.out.println("Longest palindromic substring: " + longestPalindrome);
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
