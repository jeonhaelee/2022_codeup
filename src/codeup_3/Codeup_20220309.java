package codeup_3;

import java.util.Scanner;

public class Codeup_20220309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b <= c) {
			System.out.println("삼각형아님");
		} else if (a==b && b==c){
			System.out.println("정삼각형");
		}else if(a==b || b==c || c==a) {
			System.out.println("이등변삼각형");
		} else if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
			System.out.println("직각삼각형");
		} else if (a+b > c){
			System.out.println("삼각형");
		} 
		
	}
}
