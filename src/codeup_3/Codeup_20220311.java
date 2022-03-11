package codeup_3;

import java.util.Scanner;

public class Codeup_20220311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			int number = sc.nextInt();
			if(number%5==0) {
				sum += number;
			}
		}
		
		System.out.println(sum);
	}
}



