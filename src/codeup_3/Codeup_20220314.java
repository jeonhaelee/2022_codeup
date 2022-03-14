package codeup_3;

import java.util.Scanner;

public class Codeup_20220314 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		int hexint = Integer.parseInt(hex, 16);
		
		for(int i=1; i<=Integer.parseInt("F", 16); i++) {
			System.out.printf("%s*%X=%X\n",hex,i,hexint*i);
		}
		
	}
}
