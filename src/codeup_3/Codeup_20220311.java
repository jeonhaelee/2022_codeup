package codeup_3;

import java.util.Scanner;

public class Codeup_20220311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int number = a;
		for(int i=2; i<=n; i++) {
			number = number * b + c;
		}
		System.out.println(number);
	}
}




