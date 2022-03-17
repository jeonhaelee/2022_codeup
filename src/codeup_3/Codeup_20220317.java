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
		
		// num이 짝수라면
		if (num % 2 == 0) {
			for (int i = 1; i <= num - 2; i++) {
				String print = "";
				for (int j = 1; j <= num - 2; j++) {
					if (j == i || j == num - 1 - i) {
						print += star_1;
					} else {
						print += space;
					}
				}
				System.out.println(star_1 + print + star_1);
			}
		} 
		// num이 홀수라면
		else {
			for (int i = 1; i <= num - 2; i++) {
				String print = "";
				if (i == (num - 1) / 2) {
					for (int j = 1; j <= num - 2; j++) {
						if (j == i) {
							print += star_1;
						} else {
							print += space;
						}
					}
				} else {
					for (int j = 1; j <= num - 2; j++) {
						if (j == i || j == num - 1 - i) {
							print += star_1;
						} else {
							print += space;
						}
					}
				}
				System.out.println(star_1 + print + star_1);
			}
		}
		
		System.out.println(star);
		
	}
}
