package codeup_3;

import java.util.Scanner;

public class Codeup_20220303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			if(sum>=num) {
				System.out.println(sum);
				break;
			}
		}
	}
}
