package codeup_3;

import java.util.Scanner;

public class Codeup_20220307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("양수");
		}else if(number<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}
}
