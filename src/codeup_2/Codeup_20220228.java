package codeup_2;

import java.util.Scanner;

public class Codeup_20220228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= number ; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
