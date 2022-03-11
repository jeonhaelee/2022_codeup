package codeup_3;

import java.util.Scanner;

public class Codeup_20220311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		char first = word.charAt(0);
		char second = word.charAt(2);
		
		for(int i=first; i<=second; i++) {
			System.out.printf("%c ",(char)i);
		}
	}
}
