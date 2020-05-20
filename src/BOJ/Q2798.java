package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2798 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			int n = Integer.parseInt(tmp[0]);
			int m = Integer.parseInt(tmp[1]);

			tmp = br.readLine().split(" ");
			int[] cards = new int[tmp.length];

			for (int i = 0; i < tmp.length; i++)
				cards[i] = Integer.parseInt(tmp[i]);

			int sum, max = 0;

			for (int i = 0; i < cards.length; i++) {
				for (int j = i + 1; j < cards.length; j++) {
					for (int k = j + 1; k < cards.length; k++) {
						sum = cards[i] + cards[j] + cards[k];
						if (sum >= max && sum <= m)
							max = sum;
					}
				}
			}

			bw.write(String.valueOf(max));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
