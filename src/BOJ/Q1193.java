package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1193 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int num = Integer.parseInt(br.readLine());
			int depth = 0, numerator = 0, denominator = 0;

			for (int i = 1;; i++) {
				num -= i;

				if (num <= 0) {
					depth = i;
					break;
				}
			}

			if (depth % 2 == 0) {
				denominator = depth + 1;

				for (int i = 1; i <= num + depth; i++, denominator--)
					numerator = i;

			} else {
				numerator = depth + 1;

				for (int i = 1; i <= num + depth; i++, numerator--) {
					denominator = i;
				}

			}

			System.out.println(numerator + "/" + denominator);

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
