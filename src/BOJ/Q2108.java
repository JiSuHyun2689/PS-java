package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2108 {

	static int n;
	static int[] nums;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			n = Integer.parseInt(br.readLine());
			nums = new int[n];

			for (int i = 0; i < n; i++)
				nums[i] = Integer.parseInt(br.readLine());

			Arrays.sort(nums);
			bw.write(String.valueOf(getAvg()) + "\n");
			bw.write(String.valueOf(getCenter()) + "\n");
			bw.write(String.valueOf(getMode()) + "\n");
			bw.write(String.valueOf(getRange()) + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int getRange() {
		return nums[n - 1] - nums[0];
	}

	static int getMode() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] count = new int[8001];
		int result = 0;
		int max = 0;

		for (int target : nums)
			count[4000 + target]++;

		for (int i = 0; i < 8001; i++) {
			if (count[i] != 0 && max < count[i]) {
				max = count[i];
				list.clear();
				list.add(i - 4000);
			} else if (count[i] != 0 && max == count[i])
				list.add(i - 4000);
		}

		if (list.size() == 1)
			result = list.get(0);
		else {
			Collections.sort(list);
			result = list.get(1);
		}

		return result;
	}

	static int getCenter() {
		return n % 2 == 0 ? nums[n / 2 + 1] : nums[n / 2];
	}

	static int getAvg() {

		double sum = 0;

		for (int target : nums)
			sum += target;

		return (int) Math.round(sum / n);
	}
}
