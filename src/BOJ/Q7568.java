package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q7568 {

	static int n;
	static Data[] people;
	static int[] rank;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			n = Integer.parseInt(br.readLine());
			people = new Data[n];
			rank = new int[n];
			String[] tmp;

			for (int i = 0; i < n; i++) {
				tmp = br.readLine().split(" ");
				people[i] = new Data(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), 1);
			}

			setRank();

			for (int i = 0; i < n; i++) {
				Data current = people[i];
				bw.write(String.valueOf(current.rank) + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void setRank() {

		for (int i = 0; i < n; i++) {
			Data current = people[i];
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				Data next = people[j];
				if (current.height > next.height && current.weight > next.weight)
					next.rank++;
			}
		}

	}

	static class Data {
		int height;
		int weight;
		int rank;

		public Data(int height, int weight, int rank) {
			this.height = height;
			this.weight = weight;
			this.rank = rank;
		}
	}
}
