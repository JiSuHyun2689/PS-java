package algo.book1.implementation;

public class RoyalNight {

	public static int solution(String str) {

		String[] current = str.split("");
		int[][] rules = { { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 } };
		int[][] xy = new int[1][2];
		int count = 0;

		for (int i = 0; i < current.length; i++)
			xy[0][i] = transfer(current[i]);

		for (int[] target : rules) {
			int x = xy[0][0] + target[0];
			int y = xy[0][1] + target[1];
			if (x < 1 || x > 8 || y < 1 || y > 8)
				continue;
			count++;
		}

		return count;
	}

	public static int transfer(String str) {
		return ((str.charAt(0) - 96) < 0) ? Integer.parseInt(str) : str.charAt(0) - 96;
	}

	public static void main(String[] args) {
		System.out.println(solution("a1"));
	}
}
