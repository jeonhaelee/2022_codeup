package codeup_3;

import java.util.Scanner;

public class Codeup_20220301 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String word = sc.next();
			System.out.println(word);
			if(word.equals("q")) {
				break;
			}
		}
	}
}
