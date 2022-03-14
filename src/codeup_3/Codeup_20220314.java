package codeup_3;

import java.util.Scanner;

public class Codeup_20220314 {
	public static void main(String[] args) {
		String answer = "";

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		for( int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i)==' ') {
				answer += ' ';
			}else {
				if((int)sentence.charAt(i) >= 120) {
					answer += (char)((int)sentence.charAt(i)+3 - 26);
				}else {
					answer += (char)((int)sentence.charAt(i)+3);
				}
			}
		}
		System.out.println(answer);
	}
}
