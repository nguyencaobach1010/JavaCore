package BaiTapJavaCore;

/**
 * Viết chương trình in ra các thông tin sau đây:
 * 	● Java version
	● Java Runtime Version
	● Java Home
	● Java Vendor
	● Java Vendor URL
	● Java Class Path
 *
 */

class BaiTap03 {

	public static void main(String[] args) {
		System.out.println("Java Version : " + System.getProperty("java.version"));
		System.out.println("Java Runtime Version : " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home : " + System.getProperty("java.home"));
		System.out.println("Java Vendor : " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL : " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path : " + System.getProperty("java.class.path"));

	}

}
