package codeup_3;

import java.util.Scanner;

public class Codeup_20220309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if((double)a/b > (double)c/d) {
			System.out.println(">");
		}else if((double)a/b < (double)c/d) {
			System.out.println("<");
		}else {
			System.out.println("=");
		}
	
	}
}
