package codeup_2;

import java.util.Scanner;

public class Codeup_20220226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		a = (int) (a / 10000);
		int b = sc.nextInt();
		int year = 0;
		if (b == 1 || b == 2) {
			year = 1900 + a;
		} else if (b == 3 || b == 4) {
			year = 2000 + a;
		}
		System.out.println(2012 - year + 1);

		sc.close();
	}
}
