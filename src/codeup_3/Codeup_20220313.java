package codeup_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codeup_20220313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split("");

		List<Integer> number = new ArrayList<>();

		String word = "";
		for (int i = 0; i < sentence.length; i++) {

			if (sentence[i].equals("+")) {
				number.add(Integer.parseInt(word));
				word = "";
				continue;
			} else if (sentence[i].equals("-")) {
				number.add(Integer.parseInt(word));
				word = "";
				continue;
			} else if (sentence[i].equals("*")) {
				number.add(Integer.parseInt(word));
				word = "";
				continue;
			} else if (sentence[i].equals("/")) {
				number.add(Integer.parseInt(word));
				word = "";
				continue;
			} else if (sentence[i].equals("=")) {
				number.add(Integer.parseInt(word));
				break;
			} else {
				word += sentence[i];
			}
		}

		int answer = number.get(0);
		int count = 1;
		for (int i = 0; i < sentence.length-1; i++) {
			if (sentence[i].equals("+")) {
				answer += number.get(count);
				count += 1;
				continue;
			} else if (sentence[i].equals("-")) {
				answer -= number.get(count);
				count += 1;
				continue;
			} else if (sentence[i].equals("*")) {
				answer *= number.get(count);
				count += 1;
				continue;
			} else if (sentence[i].equals("/")) {
				answer /= number.get(count);
				count += 1;
				continue;
			} 

		}
		
		System.out.println(answer);
	}
}
