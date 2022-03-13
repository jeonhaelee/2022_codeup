package codeup_3;

import java.util.Scanner;

public class Codeup_20220313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(prime_count(num)==0) {
			System.out.println("wrong number");
			break;
			}
			if(num%i==0) {
				if(prime_count(i)==0) {
					if(prime_count(num/i)==0) {
						System.out.println(i + " " + num/i);
						break;
					}
				}else {
					System.out.println("wrong number");
					break;
				}
			}
		}
		
	}

public static int prime_count(int number) {
	int count = 0;
	for(int j=2; j<number; j++) {
		if(number%j==0) {
			count+=1;
		}
	}
	return count;
}
}