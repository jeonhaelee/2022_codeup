package codeup_3;

import java.util.Scanner;

public class Codeup_20220308 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%b==0) {
			System.out.printf("%d*%d=%d",b,a/b,a);
		}else if(b%a==0) {
			System.out.printf("%d*%d=%d",a,b/a,b);
		}else {
			System.out.println("none");
		}
		
	}
}

