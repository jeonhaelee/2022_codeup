package codeup_3;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup_20220308 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double[] numbers = {a+b,a-b,b-a,a*b,a/b,b/a,Math.pow(a, b),Math.pow(b, a)};
		Arrays.sort(numbers);
		System.out.printf("%.6f",numbers[numbers.length-1]);
	}
}
