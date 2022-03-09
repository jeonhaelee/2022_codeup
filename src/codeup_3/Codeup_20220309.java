package codeup_3;

import java.util.Scanner;

public class Codeup_20220309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int non_advertise = sc.nextInt();
		int advertise = sc.nextInt();
		int cost = sc.nextInt();
		if(advertise-cost > non_advertise) {
			System.out.println("advertise");
		} else if(advertise-cost < non_advertise) {
			System.out.println("do not advertise");
		} else {
			System.out.println("does not matter");
		}
	}
}
