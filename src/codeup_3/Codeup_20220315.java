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
		
		String space = "";
		System.out.println(star);
		for(int i=n-1; i>0; i--) {
			space += " ";
			System.out.printf("%s",space);
			System.out.println(star.substring(0,i));
		}
	}
}


