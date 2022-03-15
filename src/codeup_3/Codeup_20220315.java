package codeup_3;

import java.util.Scanner;

public class Codeup_20220315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int j = a; j <= b; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%d\n", j, i, j * i);
			}
		}

	}
}
