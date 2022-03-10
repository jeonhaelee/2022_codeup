package codeup_3;

import java.util.Scanner;

public class Codeup_20220310 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		for(int i = 97; i <= (int)word.charAt(0) ; i++) {
			System.out.println((char)i);
		}
	}
}

