package codeup_3;

import java.util.Scanner;

public class Codeup_20220311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<num; i++) {
			int number = sc.nextInt();
			if(number%2==0) {
				count += 1;
			}
		}
		
		System.out.println(count);
	}
}



