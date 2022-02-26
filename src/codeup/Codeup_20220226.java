package codeup;

import java.util.Scanner;

public class Codeup_20220226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);      
	    int time = sc.nextInt();
	    int score = sc.nextInt();
	    int get = 0;
	    for (int i = time; i < 90; i+=5){
	      get += 1;
	    }
	    System.out.println(score+get);
	    sc.close();
	}
}
