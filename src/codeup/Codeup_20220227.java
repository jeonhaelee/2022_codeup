package codeup;

import java.util.Scanner;

public class Codeup_20220227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); // 나이 입력받기
		String year = String.valueOf(2012-age+1); // 출생년도를 구해 문자열로 형변환하기
		String[] year_arr = year.split(""); // 출생년도를 쪼개어 문자열 배열에 넣어주기
		int b = 0; // 출생년도 앞자리 구분하기
		if (Integer.parseInt(year_arr[0]) == 1) {
			b = 1; // 1900년대 출생이면 1
		} else {
			b = 3; // 2000년대 출생이면 3
		}
		String a; // 출생년도 뒤 두자리만 구해서 a에 넣기
		a = year_arr[2] + year_arr[3];
		int a_int = Integer.parseInt(a); // 정수형으로 바꿔주기
		System.out.printf("%d %d",a_int,b); // 출력
	}
}
