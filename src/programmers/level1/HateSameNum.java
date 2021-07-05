package programmers.level1;

import java.util.ArrayList;

public class HateSameNum {

	public int[] solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 10;

		for (int target : arr) {
			if (target != num)
				list.add(target);
			num = target;
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);

		return answer;
	}

}
