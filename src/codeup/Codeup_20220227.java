package codeup;

import java.util.Scanner;

public class Codeup_20220227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String year = String.valueOf(2012-age+1);
		String[] year_arr = year.split("");
		int b = 0;
		if (Integer.parseInt(year_arr[0]) == 1) {
			b = 1;
		} else {
			b = 3; 
		}
		String a;
		if (year_arr[2] == "0") {
			a = year_arr[3];
		} else {
			a = year_arr[2] + year_arr[3];
		}
		int a_int = Integer.parseInt(a);
		System.out.printf("%d %d",a_int,b);
	}
}
