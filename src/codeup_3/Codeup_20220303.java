package codeup_3;

import java.util.Scanner;

public class Codeup_20220303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int num = a + (n-1)*d;
		System.out.println(num);
	}
}
