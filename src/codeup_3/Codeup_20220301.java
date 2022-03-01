package codeup_3;

import java.util.Scanner;

public class Codeup_20220301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num);
		while(num != 0) {
			int number = sc.nextInt();
			System.out.println(number);
			num--;
		}
	}
}
