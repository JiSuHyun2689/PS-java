package programmers.level1;

import java.util.Arrays;

public class Budget {

	class Solution {
		public int solution(int[] d, int budget) {
			int i = 0;
			Arrays.sort(d);

			for (i = 0; i < d.length; i++) {
				budget -= d[i];
				if (budget < 0)
					break;
			}

			return i;
		}
	}

}
