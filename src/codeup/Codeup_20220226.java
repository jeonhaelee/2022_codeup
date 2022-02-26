package codeup;

import java.util.Scanner;
import java.util.Arrays;

public class Codeup_20220226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] number = { a, b, c };
		Arrays.sort(number);
		System.out.println(number[1]);
		sc.close();
	}
}
