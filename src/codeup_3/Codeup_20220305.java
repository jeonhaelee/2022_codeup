package codeup_3;

import java.util.Scanner;

public class Codeup_20220305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int[] numbers = {a,b,c,d,e};
		int max_num = numbers[0];
		int min_num = numbers[0];
		for(int i=1 ; i<numbers.length; i++) {
			if(Math.max(max_num, numbers[i])==numbers[i]) {
				max_num = numbers[i];
			} 
		}
		for(int i=1 ; i<numbers.length; i++) {
			if(Math.min(min_num, numbers[i])==numbers[i]) {
				min_num = numbers[i];
			} 
		}
		System.out.println(max_num);
		System.out.println(min_num);
	}
}
