package programmers.level1;

import java.util.Arrays;

class NumberK {
	public int[] solution(int[] array, int[][] commands) {
		int length = commands.length;
		int[] answer = new int[length];
		int[] temp = {};

		for (int tc = 0; tc < length; tc++) {
			temp = Arrays.copyOfRange(array, commands[tc][0] - 1, commands[tc][1]);
			Arrays.sort(temp);
			answer[tc] = temp[commands[tc][2] - 1];
		}
		return answer;
	}
}