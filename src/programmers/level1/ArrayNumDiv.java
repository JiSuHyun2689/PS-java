package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumDiv {

	public int[] solution(int[] arr, int divisor) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int target : arr)
			if (target % divisor == 0)
				list.add(target);

		Collections.sort(list);

		int[] answer = new int[list.size()];

		if (list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		} else
			for (int i = 0; i < list.size(); i++)
				answer[i] = list.get(i);

		
		return answer;
		
		// return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	}
}
