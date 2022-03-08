package codeup_3;

import java.util.Scanner;

public class Codeup_20220308 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sum = 0; int[] arr = {a,b,c,d};
		for(int i : arr) {
			if(i==1) {
				sum+=1;
			}
		}
		switch (sum) {
		case 1: { System.out.println("도"); break;}
		case 2: { System.out.println("개"); break;}
		case 3: { System.out.println("걸"); break;}
		case 4: { System.out.println("윷"); break;}
		case 0: { System.out.println("모"); break;}
		}
	}
}
