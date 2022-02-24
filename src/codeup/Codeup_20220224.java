package codeup;

import java.util.Scanner;

public class Codeup_20220224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double meter = sc.nextDouble();
		if (meter >= 30 && meter <= 40 ||meter >= 60 && meter <= 70) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		
		sc.close();
	}
}
