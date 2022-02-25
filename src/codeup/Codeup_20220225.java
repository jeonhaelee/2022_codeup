package codeup;

import java.util.Scanner;

public class Codeup_20220225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yyyy = sc.nextInt();
		int mm = sc.nextInt();
		int dd = sc.nextInt();
		if ((yyyy-mm+dd) % 10 ==0) {
			System.out.println("대박");
		} else { System.out.println("그럭저럭");}
	}
}
