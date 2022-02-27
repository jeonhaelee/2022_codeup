package codeup;

import java.util.Scanner;

public class Codeup_20220227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 학년 입력받기
		int b = sc.nextInt(); // 반 입력받기
		int c = sc.nextInt(); // 번호 입력받기
		System.out.printf("%d%d%02d",a,b,c); // 출력
		// %02d는 일의 자리만 있을 경우 앞을 0으로 채워서 정수를 두자리수로 맞춘다.
		// 예) 3일 경우, 03으로..
	}
}
