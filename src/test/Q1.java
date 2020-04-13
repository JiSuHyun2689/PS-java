package test;

import java.util.Scanner;
import java.util.Stack;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split("");
		Stack<String> checkStack = new Stack<String>();
		int answer = 0;

		for (String target : data) {
			if (target.equals("(") || target.equals("{") || target.equals("[") || target.equals("<")) {
				checkStack.push(target);

			}
			if (target.equals(")") || target.equals("}") || target.equals("]") || target.equals(">")) {
				if (checkStack.empty())
					answer--;
				else {
					checkStack.pop();
					answer++;
				}
			}
		}


		System.out.println(answer);

	}

}
