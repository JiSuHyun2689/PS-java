package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class SmallNum {
	public int[] solution(int[] arr) {
		if (arr.length == 1)
			return new int[] { -1 };

		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		int min = list.get(0);

		for (int target : list)
			if (min > target)
				min = target;

		list.remove(new Integer(min));

		return list.stream().mapToInt(i -> i).toArray();
		/*
		 * if (arr.length <= 1) return new int[]{ -1 }; int min =
		 * Arrays.stream(arr).min().getAsInt(); return Arrays.stream(arr).filter(i -> i
		 * != min).toArray();
		 */
	}
}
