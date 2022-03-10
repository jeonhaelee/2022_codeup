package codeup_3;

import java.util.Scanner;

public class Codeup_20220310 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=b) {
			for(int i=b;i<=a;i++) {
				System.out.println(i);
			}
		}else {
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
		}
		
	}
}

