package codeup_3;

import java.util.Scanner;

public class Codeup_20220307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String word = "th";
		if(num%10==1) {
			word = "st";
		}else if(num%10==2) {
			word = "nd";
		}else if(num%10==3) {
			word = "rd";
		}
		if(num==11 || num==12 || num==13) {
			word = "th";
		}
		System.out.println(num+word);
	}
}
