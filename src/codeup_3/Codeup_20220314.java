package codeup_3;

import java.util.Scanner;

public class Codeup_20220314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=b; j++) {
				System.out.printf("%d %d\n",i,j);
			}
		}
		
	}
}
