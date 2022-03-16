package codeup_3;

import java.util.Scanner;

public class Codeup_20220316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		String star = "";
		for(int i=1; i<=num; i++) {
			star += "*";
			if(i%2!=0) {
				String space = "";
				for(int j=1; j<=(num-i)/2; j++) {
					space += " ";
				}
				System.out.println(space+star);
			}
		}
	}
}

