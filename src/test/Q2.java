package test;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer_sheet = sc.nextLine();
		String[] answers = answer_sheet.split("");
		;
		String[] sheets = sc.nextLine().split(",");
		int doubt = 0;
		int doubtPossibility = 0;

//		System.out.println("Answer : " + answer_sheet);
//		for (int i = 0; i < sheets.length; i++) {
//			System.out.println("A" + i + " : " + sheets[i]);
//		}
		int count = 0;

		for (int i = 0; i < answers.length; i++) {
			count = 0;
			for (int j = 0; j < sheets.length; j++) {
				if (!answers[i].equals(sheets[j].split("")[i])) {
					count++;
				}
			}
			System.out.println("answer : " + answers[i]);
			System.out.println("A1:" + sheets[0].split("")[i]);
			System.out.println("A1:" + sheets[1].split("")[i]);
			System.out.println("A1:" + sheets[2].split("")[i]);
			System.out.println("A1:" + sheets[3].split("")[i]);
			if (count > 0) {
				doubt++;
			}
		}
		System.out.println(count);
	}

}
