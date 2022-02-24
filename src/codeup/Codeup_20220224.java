package codeup;

import java.util.Scanner;

public class Codeup_20220224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a % 7 == 0 ?"multiple" : "not multiple");
		sc.close();
	}
}
