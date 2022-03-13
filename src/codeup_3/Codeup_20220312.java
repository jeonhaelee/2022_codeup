package codeup_3;

import java.util.Scanner;

public class Codeup_20220312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i=0; i<num;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(nums[0]);
		System.out.println(nums[(num+1)/2-1]);
		System.out.println(nums[num-1]);
	}
}
