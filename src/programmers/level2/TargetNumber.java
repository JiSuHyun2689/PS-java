package programmers.level2;

public class TargetNumber {

	public int solution(int[] numbers, int target) {
		return dfs(numbers, target, 0, 0);
	}

	public int dfs(int[] numbers, int target, int idx, int sum) {
		if (idx == numbers.length)
			return target == sum ? 1 : 0;
		else
			return dfs(numbers, target, idx + 1, sum + numbers[idx])
					+ dfs(numbers, target, idx + 1, sum - numbers[idx]);
	}
}
