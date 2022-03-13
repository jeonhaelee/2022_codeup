package codeup_3;

import java.util.Scanner;

public class Codeup_20220312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int k=1; k<num; k++) {
			if((int)Math.sqrt(num-k) == Math.sqrt(num-k)) {
				System.out.printf("%d ",k);
				System.out.println((int)Math.sqrt(num-k));
				break;
			}
		}
	}
}
