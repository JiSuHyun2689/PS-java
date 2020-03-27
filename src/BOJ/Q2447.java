package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2447 {

	static char[][] arr;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			arr = new char[n][n];

			for (int i = 0; i < n; i++)
				Arrays.fill(arr[i], ' ');

			divideAndQonquer(n, 0, 0);

			for (int i = 0; i < n; i++) {
				bw.write(arr[i]);
				bw.write("\n");
			}

			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void divideAndQonquer(int n, int x, int y) {
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}
		int div = n / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue;
				divideAndQonquer(div, x + (i * div), y + (j * div));

			}
		}

	}

}
