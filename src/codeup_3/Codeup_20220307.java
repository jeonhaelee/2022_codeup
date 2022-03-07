package codeup_3;

import java.util.Scanner;

public class Codeup_20220307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num_10;
		int num_1;
		num_10 = (int) number / 10;
		num_1 = number % 10;
		int number_fin = (num_1 * 10 + num_10)*2;
		if(number_fin/100 >= 0) {
			number_fin = number_fin%100;
		}
		System.out.println(number_fin);
		if(number_fin<=50) {
			System.out.println("GOOD");
		} else {
			System.out.println("OH MY GOD");
		}
	}
}
