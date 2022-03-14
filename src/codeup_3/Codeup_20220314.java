package codeup_3;

import java.util.Scanner;

public class Codeup_20220314 {
	public static void main(String[] args) {
		String answer = "";

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		for( int i=0; i<sentence.length(); i++) {
			if(65<=(int)sentence.charAt(i) && (int)sentence.charAt(i)<=90) {
				answer +=  (char)((int)sentence.charAt(i)+32);
			}else if(97<=(int)sentence.charAt(i) && (int)sentence.charAt(i)<=122) {
				answer +=  (char)((int)sentence.charAt(i)-32);
			}else {
				answer += sentence.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
