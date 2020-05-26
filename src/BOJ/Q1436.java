package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1436 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			int num = 665;

			while (n != 0) {
				num++;
				if (String.valueOf(num).contains("666"))
					n--;
			}

			bw.write(String.valueOf(num));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
