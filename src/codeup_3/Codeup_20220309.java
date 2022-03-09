package codeup_3;

import java.util.Scanner;

public class Codeup_20220309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int score_1 = sc.nextInt();
		int score_2 = sc.nextInt();
		
		for(int i=time; i<90;i += 5) {
				score_1++;
		}
		
		if(score_1>score_2) {
			System.out.println("win");
		}else if(score_1<score_2) {
			System.out.println("lose");
		}else {
			System.out.println("same");
		}
	}
}
