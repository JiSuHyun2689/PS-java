package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2775 {

	public static void main(String[] args) {

		final int SIZE = 15;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int testCase = Integer.parseInt(br.readLine());
			int[][] house = new int[SIZE][SIZE];
			int k, n;

			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (i == 0) {
						house[i][j] = j + 1;
						continue;
					}
					if (j == 0)
						house[i][j] = 1;
					else
						house[i][j] = house[i][j - 1] + house[i - 1][j];

				}
			}

			for (int i = 0; i < testCase; i++) {
				k = Integer.parseInt(br.readLine());
				n = Integer.parseInt(br.readLine());

				System.out.println(house[k][n - 1]);
			}

			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
