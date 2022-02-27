package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup_20220227 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 세 수 입력받기
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		int[] numbers = {a,b,c}; // 세 수를 배열에 담아 오름차순으로 정렬하기
		Arrays.sort(numbers); 
		for (int i=0; i<numbers.length; i++) { 
			System.out.printf("%d ",numbers[i]); // 정렬된 순서대로 출력
		}
	}
}
