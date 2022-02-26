package codeup;

import java.util.Scanner;

public class Codeup_20220226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}
}
