package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2839 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int kg = Integer.parseInt(br.readLine());
			int count = 0;

			while (true) {
				if (kg % 5 == 0) {
					count += kg / 5;
					break;
				} else if (kg <= 0) {
					count = -1;
					break;
				}
				kg -= 3;
				count++;
			}

			System.out.println(count);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
