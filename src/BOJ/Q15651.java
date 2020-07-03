package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15651 {

	static int n, m;
	static int[] arr;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] inputs = br.readLine().split(" ");
			n = Integer.parseInt(inputs[0]);
			m = Integer.parseInt(inputs[1]);
			arr = new int[n + 1];

			backTracking(0, bw);
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void backTracking(int cnt, BufferedWriter bw) throws Exception {
		if (cnt == m) {
			for (int i = 0; i < m; i++)
				bw.write(Integer.toString(arr[i]) + " ");
			bw.write("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[cnt] = i;
			backTracking(cnt + 1, bw);
		}
	}

}
