package programmers.level1;

public class Lotto {
	class Solution {
		public int[] solution(int[] lottos, int[] win_nums) {
			int[] nums = new int[46];
			int cnt = 0;

			for (int i = 0; i < win_nums.length; i++) {
				nums[lottos[i]] = lottos[i] != 0 ? nums[lottos[i]] + 1 : nums[lottos[i]] - 1;
				nums[win_nums[i]]++;
			}

			for (int target : nums) {
				if (target == 2)
					cnt++;
			}
			return getRank(cnt, nums[0]);
		}

		public int[] getRank(int cnt, int zeroNums) {
			int[] result = new int[2];
			result[0] = (Math.abs(zeroNums) == 0 && cnt == 0) ? 6 : 7 - (cnt + Math.abs(zeroNums));
			result[1] = (cnt == 0) ? 6 : 7 - cnt;
			return result;
		}
	}
}
