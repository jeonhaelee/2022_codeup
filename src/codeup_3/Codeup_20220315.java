package codeup_3;

import java.util.Scanner;

public class Codeup_20220315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String star = "";
		for(int i=0; i<n;i++) {
			star += "*";
		}
		String star2 = "*";
		for(int i=1; i<n-1;i++) {
			star2 += " ";
		}
		star2 += "*";
		
		System.out.println(star);
		for(int i=1; i<n-1;i++) {
			System.out.println(star2);
		}
		System.out.println(star);

	}
}

