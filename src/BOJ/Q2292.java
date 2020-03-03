package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2292 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int num = Integer.parseInt(br.readLine());
			int prev = 1;
			int count = 1;

			for (int i = 1; i < 1000000; i++) {
				if (prev < num && (prev += 6 * i) >= num) {
					count += i;
					break;
				}
			}

			System.out.println(count);

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
