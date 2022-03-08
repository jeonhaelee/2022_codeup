package codeup_3;

import java.util.Scanner;

public class Codeup_20220308 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = {a,b}; int sum = 0;
		for(int i : arr) {
			switch (i) {
			case 1: {sum+=400; break;}
			case 2: {sum+=340; break;}
			case 3: {sum+=170; break;}
			case 4: {sum+=100; break;}
			case 5: {sum+=70; break;}
			}
		}
		if(sum>500) {
			System.out.println("angry");
		}else {
			System.out.println("no angry");
		}
	}
}
