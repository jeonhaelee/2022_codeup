package codeup;

import java.util.Scanner;

public class Codeup_20220228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int number = sc.nextInt();
			if (number==0) {
				break;
			}
			System.out.println(number);
		}
	}
}
