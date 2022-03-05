package codeup_3;

import java.util.Scanner;

public class Codeup_20220305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "";
		String stars = "";
		for (int j = 1; j <= num; j++) {
			star += "*";
		}
		for(int i=1; i<=9;i++) {
			stars += star;
			System.out.println(stars);
		}
	}
}
