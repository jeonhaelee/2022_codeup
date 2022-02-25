package codeup;

import java.util.Scanner;

public class Codeup_20220225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String aaa = a % 2 == 0 ? "짝수" : "홀수";
		String bbb = b % 2 == 0 ? "짝수" : "홀수";
		String ab = (a+b) % 2 == 0 ? "짝수" : "홀수";
		System.out.printf(aaa + "+" + bbb + "=" + ab);
	}
}
