package codeup_3;

import java.util.Scanner;

public class Codeup_20220303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		long num = (long)(a*Math.pow(r, n-1));
		System.out.println(num);
	}
}
