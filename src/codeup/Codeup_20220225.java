package codeup;

import java.util.Scanner;

public class Codeup_20220225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yyyy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		int num = (int)((yyyy+mm+dd) / 100) ;
		if (num % 2 ==0) {
			System.out.println("대박");
		} else { System.out.println("그럭저럭");}
	}
}
