package codeup_3;

import java.util.Scanner;

public class Codeup_20220316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String star = "";
		for(int i=0; i<num; i++) {
			star += "*";
			System.out.println(star);
		}
		for(int i=1; i<num; i++) {
			System.out.println(star.substring(0,num-i));
		}
	}
}

