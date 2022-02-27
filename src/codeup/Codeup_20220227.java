package codeup;

import java.util.Scanner;

public class Codeup_20220227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt(); // 시간과 분 입력받기
		int minute = sc.nextInt(); 
		
		if (minute < 30) { 		
			if (hour == 0) {
				hour = 23;
			} else {
				hour -= 1;
			}
			minute += 30;
		} else {
			minute -= 30;
		}
		
		System.out.println(hour + " " + minute); // 출력
	}
}
