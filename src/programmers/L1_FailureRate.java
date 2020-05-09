package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class L1_FailureRate {
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Rate[] rates = new Rate[N];
		int totalPlayer = 0, unClearPlayer = 0;

		for (int stage = 1; stage <= N; stage++) {

			totalPlayer = 0;
			unClearPlayer = 0;

			for (int i = 0; i < stages.length; i++) {
				if (stages[i] == stage) {
					unClearPlayer++;
					totalPlayer++;
				} else if (stages[i] > stage) {
					totalPlayer++;
				}
			}

			if (totalPlayer == 0)
				rates[stage - 1] = new Rate(stage, 0);
			else
				rates[stage - 1] = new Rate(stage, (double) unClearPlayer / totalPlayer);
		}

		Arrays.sort(rates, new Comparator<Rate>() {
			@Override
			public int compare(Rate o1, Rate o2) {
				if (o1.failureRate != o2.failureRate)
					return -Double.compare(o1.failureRate, o2.failureRate);
				return o1.idx - o2.idx;
			}
		});
		
		
		for (int i=0; i<N; i++) 
			answer[i] = rates[i].idx;

		return answer;
	}

	static class Rate {
		private int idx;
		private double failureRate;

		public Rate(int idx, double failureRate) {
			this.idx = idx;
			this.failureRate = failureRate;
		}

		public int getIdx() {
			return idx;
		}

		public void setIdx(int idx) {
			this.idx = idx;
		}

		public double getFailureRate() {
			return failureRate;
		}

		public void setFailureRate(double failureRate) {
			this.failureRate = failureRate;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(5, arr);
	}
}