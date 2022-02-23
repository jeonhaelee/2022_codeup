package codeup;

import java.util.Scanner;

public class Codeup_20220223 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int num2 = Integer.valueOf(num,16);
		String num3 = Integer.toOctalString(num2);
		System.out.println(num3);
		sc.close();
	}
}
