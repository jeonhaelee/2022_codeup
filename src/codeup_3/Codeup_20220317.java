package codeup_3;

import java.util.Scanner;

public class Codeup_20220317 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String star = "";
		for (int i = 1; i <= num; i++) {
			star += "*";
		}

		String star_1 = "*";
		String space = " ";

		System.out.println(star);

		for (int i = 1; i <= num - 2; i++) {
			String print = "";
			if (i == (num - 1) / 2) {
				for (int j = 1; j <= num - 2; j++) {
					print += star_1;
				}
			} else {
				for (int j = 1; j <= num - 2; j++) {
					if (j == i || j == num - 1 - i || j == (num-1)/2) {
						print += star_1;
					} else {
						print += space;
					}
				}
			}
			System.out.println(star_1 + print + star_1);
		}

		System.out.println(star);

	}
}
