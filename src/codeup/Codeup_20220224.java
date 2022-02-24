package codeup;

import java.util.Scanner;

public class Codeup_20220224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double meter = sc.nextDouble();
		System.out.println(meter >= 50 && meter <= 60 ? "win" : "lose");
		sc.close();
	}
}
