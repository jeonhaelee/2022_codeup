package codeup_3;

import java.util.Scanner;

public class Codeup_20220313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] wave = new int[b];
		for(int i=0; i<b ;i++) {
			wave[i] = sc.nextInt();
		}
		
		double money = a;
		for(int i=0; i<b; i++) {
			money = money * ((double)(100+wave[i])/100);
		}
		
		System.out.println(Math.round(money)-a);
		if(Math.round(money)-a>0.5) {
			System.out.println("good");
		}else if(Math.round(money)-a<-0.5) {
			System.out.println("bad");
		}else {
			System.out.println("same");
		}
	}
}