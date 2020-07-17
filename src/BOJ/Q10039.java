package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Q10039 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int sum = 0;
			int temp;

			for (int i = 0; i < 5; i++) {
				temp = Integer.parseInt(br.readLine());
				sum += temp < 40 ? 40 : temp;
			}

			bw.write(String.valueOf(sum / 5));
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
