package codeup_3;

import java.util.Scanner;

public class Codeup_20220301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i=1; i<=number;i++) {
			sum += i;
			if(sum >= number) {
				System.out.println(i);
				break;
			}
		}
	}
}
