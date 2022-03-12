package codeup_3;

import java.util.Scanner;

public class Codeup_20220312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer = 1;
		for ( int i=num; i>=1; i--) {
			answer = answer * i;
		}
		System.out.printf("%d",answer);
	}
}
