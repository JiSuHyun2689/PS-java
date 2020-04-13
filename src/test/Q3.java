package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String road = sc.nextLine();
		StringBuilder sb = new StringBuilder(road);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		int answer = 0, max = 0;

		if (road.length() < 1 || road.length() > 300000 || n < 0 || n > 300000) {
			return;
		}

		for (int i = 0; i < road.length(); i++) {
			if (road.split("")[i].equals("0")) {
				indexs.add(i);
			}
		}

		for (int i = 0; i < indexs.size() - 1; i++) {

			for (int k = i; k < n + i; k++) {

				for (int j = 0; j < n; j++) {
					if (k >= indexs.size())
						break;

					sb.setCharAt(indexs.get(k), '1');
				}
			}

			max = checkOne(sb.toString());
			if(max > answer) {
				answer = max;
			}

			for (int k = i; k < n + i; k++) {

				for (int j = 0; j < n; j++) {
					if (k >= indexs.size())
						break;

					sb.setCharAt(indexs.get(k), '0');
				}
			}
		}
		System.out.println(sb);

		System.out.println(answer);

	}

	static int checkOne(String road) {
		int count = 0;
		for (int i = 1; i < road.length(); i++) {
			if (road.split("")[i].equals("1") && road.split("")[i - 1].equals("1")) {
				if (i < road.length() - 1 && road.split("")[i + 1].equals("1"))
					count++;
			}
		}
		return count;
	}

}
