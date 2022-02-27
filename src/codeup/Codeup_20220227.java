package codeup;

import java.util.Scanner;

public class Codeup_20220227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 학년 입력받기
		int b = sc.nextInt(); // 반 입력받기
		int c = sc.nextInt(); // 번호 입력받기
		System.out.printf("%d%02d%03d",a,b,c); // 출력
	}
}
