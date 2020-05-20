package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int num = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(decomposition(num)));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static int decomposition(int num) {

		for (int i = num - (checkDigit(num) * 9); i < num; i++) {
			int sum = i;
			int temp = i;

			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}

			if (sum == num)
				return i;

		}

		return 0;
	}

	static int checkDigit(int num) {
		int cnt = 0;
		while (num != 0) {
			num /= 10;
			cnt++;
		}
		return cnt;
	}

}
